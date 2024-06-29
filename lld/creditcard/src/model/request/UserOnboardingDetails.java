/**
 * author: akhilpathivada
 * time: 20/06/24 15:21
 */
package model.request;

import lombok.Data;
import model.KYCDetails;

@Data
public class UserOnboardingDetails {
    
    double salaryPerMonth;
    
    KYCDetails kycDetails;
    
    int age;

    public UserOnboardingDetails(int i, Object o, int i1) {
    }
}
