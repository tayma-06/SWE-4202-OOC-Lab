public class User {
    private String userID;
    private String name;
    private String phoneNo;
    private String membershipType;
    private boolean accountStatus;

    public User(String userId, String name, String phoneNo, String membershipType) {
        this.userID = userId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.membershipType = membershipType;
        this.accountStatus = true;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean getAccountStatus() {
        return accountStatus;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void deactivate() {
        setAccountStatus(false);
    }

    public void reactivate() {
        setAccountStatus(true);
    }

    public void display() {
        System.out.println("User ID : " + getUserID());
        System.out.println("Name : " + getName());
        System.out.println("Phone Number : " + getPhoneNo());
        System.out.println("Membership Type : " + getMembershipType());
        System.out.println("Account Status : " + (getAccountStatus() ? "Activated" : "Deactivated"));
    }
}
