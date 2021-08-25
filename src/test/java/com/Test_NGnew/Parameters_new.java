package com.Test_NGnew;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameters_new {
	
	
   @Test
   @Parameters("name")
   
   private void Username(@Optional("priya") String name){
         System.out.println("Username:"+name);
   }
  

  @Test
  @Parameters("password")
 
   private void Password(@Optional("***") String password){
	      System.out.println("Password:"+password);
   }


   @Test
   @Parameters("address")
   private void Address(@Optional("chennai") String address){
	        System.out.println("Address:"+address);
   }


   @Test
   @Parameters("mailid")
   private void Mailid(@Optional("priya@gmail.com") String maildid ){
	        System.out.println("Emaid id:"+maildid);
   }








}