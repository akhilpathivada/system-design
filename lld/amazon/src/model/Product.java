/**
 * author: akhilpathivada
 * time: 06/05/24 09:06
 */
package model;

import actor.Seller;

public class Product {

    int id;

    Seller seller;

    double cost;

    String description;

    ProductCategory productCategory;

    List<ProductReview> productReviews;
}
