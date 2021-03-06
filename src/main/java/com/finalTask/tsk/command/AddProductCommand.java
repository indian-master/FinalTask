package com.finalTask.tsk.command;

import com.finalTask.tsk.constants.ForwardPath;
import com.finalTask.tsk.constants.RedirectPath;
import com.finalTask.tsk.dao.ProductDao;
import com.finalTask.tsk.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest request,
                          HttpServletResponse response) throws IOException, ServletException {
        String forward;

        Product product = new Product();

        product.setNameEn(request.getParameter("name"));
        product.setCode(request.getParameter("product_code"));
        product.setCost(Double.parseDouble(request.getParameter("product_cost")));
        product.setQuantity(Double.parseDouble(request.getParameter("quantity")));

        forward = ForwardPath.ERROR_PAGE;

        if (isProductEmpty(product.getNameEn(), product.getCode(), product.getCost(), product.getQuantity())) {
            return forward;
        }

        forward = RedirectPath.GOODS_PAGE;

        new ProductDao().addProduct(product);

        return forward;
    }

    private boolean isProductEmpty(String name, String code, Double cost, Double quantity) {
        return (name == null || code == null || cost == null || quantity == null ||
                name.isEmpty() || code.isEmpty() || cost.isNaN() || quantity.isNaN());
    }
}
