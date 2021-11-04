package ss5_access_modifier_static_method_static_propety.bai_tap.xay_dung_lop_chi_ghi_trong_java;

 class Student {
     private String name;
     private String classes;

     public Student(){}

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getClasses() {
         return classes;
     }

     public void setClasses(String classes) {
         this.classes = classes;
     }

     String getName1 (){
         return this.name;
     }

     void setName1(String name1){
         this.name = name1;
     }
 }
