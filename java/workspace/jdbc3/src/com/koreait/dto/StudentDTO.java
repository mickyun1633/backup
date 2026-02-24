package com.koreait.dto;

public class StudentDTO {
//   CREATE TABLE TBL_STUDENT(
//         STU_NUMBER NUMBER,
//         STU_NAME VARCHAR2(100) NOT NULL,
//         STU_MAJOR VARCHAR2(100) NOT NULL,
//         CONSTRAINT PK_STUDENT PRIMARY KEY(STU_NUMBER)
//      );

   private int stuNumber;
   private String stuName;
   private String stuMajor;

   public int getStuNumber() {
      return stuNumber;
   }

   public void setStuNumber(int stuNumber) {
      this.stuNumber = stuNumber;
   }

   public String getStuName() {
      return stuName;
   }

   public void setStuName(String stuName) {
      this.stuName = stuName;
   }

   public String getStuMajor() {
      return stuMajor;
   }

   public void setStuMajor(String stuMajor) {
      this.stuMajor = stuMajor;
   }

   @Override
   public String toString() {
      return "StudentDTO [stuNumber=" + stuNumber + ", stuName=" + stuName + ", stuMajor=" + stuMajor + "]";
   }

}
