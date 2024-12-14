/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

/**
 *
 * @author hp
 */
public class MemberSessionDTO {
    private int memberId;
    private String memberName;
    private String email;
    private String subscriptionType;
    private String progressLevel;
    private int sessionId;
    private String sessionTime;
    private String trainerName;
    private String className;
    private String sessionStatus;
    private int enrolledMembersCount;

    // Constructor
    public MemberSessionDTO(int memberId, String memberName, String email, String subscriptionType, 
                            String progressLevel, int sessionId, String sessionTime, 
                            String trainerName, String className, String sessionStatus, int enrolledMembersCount) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.subscriptionType = subscriptionType;
        this.progressLevel = progressLevel;
        this.sessionId = sessionId;
        this.sessionTime = sessionTime;
        this.trainerName = trainerName;
        this.className = className;
        this.sessionStatus = sessionStatus;
        this.enrolledMembersCount = enrolledMembersCount;
    }

    // Getters and Setters
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public String getProgressLevel() {
        return progressLevel;
    }

    public void setProgressLevel(String progressLevel) {
        this.progressLevel = progressLevel;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public int getEnrolledMembersCount() {
        return enrolledMembersCount;
    }

    public void setEnrolledMembersCount(int enrolledMembersCount) {
        this.enrolledMembersCount = enrolledMembersCount;
    }
}
