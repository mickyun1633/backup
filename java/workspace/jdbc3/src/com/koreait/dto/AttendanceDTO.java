package com.koreait.dto;

public class AttendanceDTO {
//   CREATE TABLE TBL_ATTENDANCE(
//         ATT_NUMBER NUMBER,
//         STU_NUMBER NUMBER NOT NULL,
//         ATT_ADATE DATE NOT NULL,
//         ATT_STATUS VARCHAR2(20) NOT NULL,
//         CONSTRAINT PK_ATTENDANCE PRIMARY KEY(ATT_NUMBER),
//          CONSTRAINT FK_STU FOREIGN KEY(STU_NUMBER) REFERENCES TBL_STUDENT(STU_NUMBER)
//      );

   private int attNumber;
   private int stuNumber;
   private String attAdate;
   private String attStatus;

   public int getAttNumber() {
      return attNumber;
   }

   public void setAttNumber(int attNumber) {
      this.attNumber = attNumber;
   }

   public int getStuNumber() {
      return stuNumber;
   }

   public void setStuNumber(int stuNumber) {
      this.stuNumber = stuNumber;
   }

   public String getAttAdate() {
      return attAdate;
   }

   public void setAttAdate(String attAdate) {
      this.attAdate = attAdate;
   }

   public String getAttStatus() {
      return attStatus;
   }

   public void setAttStatus(String attStatus) {
      this.attStatus = attStatus;
   }

   @Override
   public String toString() {
      return "AttendanceDTO [attNumber=" + attNumber + ", stuNumber=" + stuNumber + ", attAdate=" + attAdate
            + ", attStatus=" + attStatus + "]";
   }

}
