/**
 * author: akhilpathivada
 * time: 20/06/24 15:10
 */
package model;

import lombok.Data;

@Data
public class User {

    int userId;

    String name;

    Account account;

    CardDetails cardDetails;
}
