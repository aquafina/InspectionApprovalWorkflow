package uiinspectionapproval;

import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;

public class UserWLProfile {
    private String userID;
    private RichInputText userIdInputText;

    public UserWLProfile() {
        super();
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        ADFContext adfc = ADFContext.getCurrent();
        SecurityContext sc = adfc.getSecurityContext();
        String userid = sc.getUserProfile().getProperty("employeenumber").toString();
        System.out.println("User Id = "+userid);
        return userid;
    }

    public void setUserIdInputText(RichInputText userIdInputText) {
        this.userIdInputText = userIdInputText;
    }

    public RichInputText getUserIdInputText() {
        return userIdInputText;
    }
}
