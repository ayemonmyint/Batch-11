package com.batcheleven.one;

import java.util.Scanner;

public class PhoneBillPackageCaller {
    public static void main(String[] args) {
        System.out.println("Please call *979#.Thanks for using Telenor");
        System.out.print("Enter call center number: ");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

       if (userInput.equals("*979#")){
           System.out.println("Enter 1 for ပါဝါ Load");//ab
           System.out.println("Enter 2 for packages");//now coding//ac//finished
           System.out.println("Enter 3 for မိမိအကောင့်");//now//ae//finished
//           System.out.println("Enter 4 for ဘေလ်အကူအညီ");
//           System.out.println("Enter 5 for Settings");
//           System.out.println("Enter 99 for English");
           System.out.print("Enter number: ");

           String a = sc.nextLine();
           if (a.equals("1")){
               System.out.println("Enter 1 for 1999Ks-965MB-30D");
               System.out.println("Enter 2 for 999Ks-480MB-30D");
               System.out.println("Enter 3 for 999Ks-4680Sec-15D");
               System.out.println("Enter 4 for 2999Ks-1445MB-30D");
               System.out.println("Enter 5 for 999Ks-155Min-30D");
               System.out.println("Enter 6 for 1996Ks-9300Sec-30D");
               System.out.println("Enter 7 for 499Ks-2100Sec-7D");
               System.out.print("Enter number: ");

               String ab= sc.nextLine();
               if (ab.equals("1")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String aba= sc.nextLine();
                   if (aba.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (aba.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }

               }else if (ab.equals("2")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String abb= sc.nextLine();
                   if (abb.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (abb.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }
               }else if (ab.equals("3")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String abc= sc.nextLine();
                   if (abc.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (abc.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }
               }else if (ab.equals("4")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String abd= sc.nextLine();
                   if (abd.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (abd.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }
               }else if (ab.equals("5")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String abe= sc.nextLine();
                   if (abe.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (abe.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }
               }else if (ab.equals("6")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String abf= sc.nextLine();
                   if (abf.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (abf.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }
               }else if (ab.equals("7")){
                   System.out.println("Are you sure to buy this package");
                   System.out.println("Enter 1 to buy");
                   System.out.println("Enter 0 to cancel");
                   System.out.print("Please Confirm: ");

                   String abg= sc.nextLine();
                   if (abg.equals("1")){
                       System.out.println("Purchase success.");
                   }else if (abg.equals("0")){
                       System.out.println("Cancel your choice");
                   }else {
                       System.out.println("Something Wrong");
                   }
               }else {
                   System.out.println("Something Wrong!");
               }
           }

           else if (a.equals("2")){
               System.out.println("Enter 1 for ဖုန်းခေါ်");
               System.out.println("Enter 2 for ဒေတာ");//finished
               System.out.println("Enter 3 for Night/FB ဒေတာ");
               System.out.println("Enter 4 for My Tune");//continue//finished
               System.out.println("Enter 5 for နိုင်ငံတကာ");//now coding//finished
               System.out.println("Enter 6 for VAS");//now//finished
               System.out.println("Enter 7 for SMS");//now//finished
               System.out.print("Enter number : ");

               String ac = sc.nextLine();
               if (ac.equals("1")){
                   System.out.println("တယ်လီနော အချင်းချင်း");
                   System.out.println("Enter 1 for ၁၀ မိနစ် ၉၉ကျပ် ");
                   System.out.println("Enter 2 for ၅၀ မိနစ် ၄၀၀ကျပ် ");
                   System.out.println("Enter 3 for Cancel");
                   System.out.print("Enter number: ");
                   String aca = sc.nextLine();
                   if (aca.equals("1")){
                       System.out.println("Are you sure to buy this package?");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");
                       String acaa=sc.nextLine();
                       if (acaa.equals("1")){
                           System.out.println("Purchase success!");
                       }else if (acaa.equals("0")){
                           System.out.println("Cancel your choice!");
                       }else {
                           System.out.println("Something Wrong");
                       }
                   }else if (aca.equals("2")){
                       System.out.println("Are you sure to buy this package?");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");
                       String acab=sc.nextLine();
                       if (acab.equals("1")){
                           System.out.println("Purchase success!");
                       }else if (acab.equals("0")){
                           System.out.println("Cancel your choice!");
                       }else {
                           System.out.println("Something Wrong");
                       }
                   }else if (aca.equals("3")){
                       System.out.println("Cancel your choice");
                   }

               }
               else if (ac.equals("2")){
                   System.out.println("Enter 1 for ၃၅၀ MB- ၇၉၉ကျပ် ");
                   System.out.println("Enter 2 for ၄၂၅ MB- ၉၄၉ကျပ်");
                   System.out.println("Enter 3 for ၄၈၀ MB- ၉၉၉ကျပ်");
                   System.out.println("Enter 4 for ၇၇၀ MB- ၁၅၉၉ကျပ်");
                   System.out.println("Enter 0 for Cancel");
                   System.out.print("Enter your choice: ");
                   String acb = sc.nextLine();
                   if (acb.equals("1")){
                       System.out.println("Are you sure to buy this package?");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");
                       String acba = sc.nextLine();
                       if (acba.equals("1")){
                           System.out.println("Purchase success!");
                       }else if (acba.equals("0")){
                           System.out.println("Cancel your choice!");
                       }

                   }else if (acb.equals("2")){
                       System.out.println("Are you sure to buy this package?");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");
                       String acbb = sc.nextLine();
                       if (acbb.equals("1")){
                           System.out.println("Purchase success!");
                       }else if (acbb.equals("0")){
                           System.out.println("Cancel your choice!");
                       }
                   }else if (acb.equals("3")){
                       System.out.println("Are you sure to buy this package?");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");
                       String acbd = sc.nextLine();
                       if (acbd.equals("1")){
                           System.out.println("Purchase success!");
                       }else if (acbd.equals("0")){
                           System.out.println("Cancel your choice!");
                       }else {
                           System.out.println("Something Wrong");
                       }
                   }else if (acb.equals("4")){
                       System.out.println("Are you sure to buy this package?");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");
                       String acbe = sc.nextLine();
                       if (acbe.equals("1")){
                           System.out.println("Purchase success!");
                       }else if (acbe.equals("0")){
                           System.out.println("Cancel your choice!");
                       }else {
                           System.out.println("Something Wrong");
                       }
                   }else if (acb.equals("0")){
                       System.out.println("Cancel your choice");

                   }
               }
               else if (ac.equals("3")){
                   System.out.println("Enter 6 for Viber+မက်ဆေ့ ၁၉၉ ကျပ် ");
                   System.out.println("Enter 0 to Cancel: ");
                   System.out.print("Enter number : ");

                   String acc = sc.nextLine();
                   if (acc.equals("6")){
                       System.out.println("Are you sure to buy this package");
                       System.out.println("Enter 1 to buy");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number : ");

                       String acca = sc.nextLine();
                       if (acca.equals("1")){
                           System.out.println("Purchase success");

                       }else if (acca.equals("0")){
                           System.out.println("Canceled");
                       }else {
                           System.out.println("Something Wrong");
                       }
                   }

               }
               else if (ac.equals("4")){
                   System.out.println("Enter 1 for ခေါ်ဆိုသူနားဆင်");//now coding//finished//acda
                   System.out.println("Enter 2 for ကိုယ်တိုင်နားဆင်");//now coding //acdb//finished
                   System.out.println("Enter 3 for လူကြိုက်အများဆုံးတေးသွား");//now coding// acdc//finished
                   System.out.println("Enter 0 for cancel");//finished
                   System.out.print("Enter number: ");

                   String acd = sc.nextLine();
                   if (acd.equals("1")){
                       System.out.println("ခေါ်ဆိုသူနားဆင်တေးသွား ");
                       System.out.println("Enter 1 for အပတ်ဆင် ၃၁၅ ကျပ်");
                       System.out.println("Enter 2 for နေ့စဉ် ၅၀ ကျပ်");
                       System.out.println("Enter 3 for cancel ");
                       System.out.print("Enter number: ");

                       String acda=sc.nextLine();
                       if (acda.equals("1")){
                           System.out.println("Are you sure to buy this package");
                           System.out.println("Enter 1 to buy");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number : ");

                           String  acdaa = sc.nextLine();
                           if (acdaa.equals("1")){
                               System.out.println("success");
                           }else if (acdaa.equals("0")){
                               System.out.println("cancel");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }else if (acda.equals("2")){
                           System.out.println("Are you sure to buy this package");
                           System.out.println("Enter 1 to buy");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number");
                           String  acdab = sc.nextLine();
                           if (acdab.equals("1")){
                               System.out.println("success");
                           }else if (acdab.equals("0")){
                               System.out.println("cancel");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                   }
                   else if (acd.equals("2")){
                       System.out.println("ကိုယ်တိုင်နားဆင်တေးသွား");
                       System.out.println("Enter 1 for အပတ်စဉ် ၃၂၅ ကျပ် ");
                       System.out.println("Enter 0 for Cancel");
                       System.out.print("Enter number: ");

                       String acdb=sc.nextLine();
                       if (acdb.equals("1")){
                           System.out.println("Are you sure to buy this package");
                           System.out.println("Enter 1 to buy");
                           System.out.println("Enter 0 to Cancel");
                           System.out.print("Enter number: ");

                           String acdba = sc.nextLine();
                           if (acdba.equals("1")){
                               System.out.println("Success");
                           }else if (acdba.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }else if (acdb.equals("0")){
                           System.out.println("Canceled");
                       }
                   }
                   else if (acd.equals("3")){
                       System.out.println("သီချင်းတစ်ပုဒ် ၃၁၅ ကျပ်");
                       System.out.println("Enter 1 for တံခါးဖွင့်ထားပါတယ်။");
                       System.out.println("Enter 2 for မောင့်နောက်လိုက်ခဲ့မယ်။");
                       System.out.println("Enter 0 for Cancel");
                       System.out.print("Enter number: ");
                       String acdc = sc.nextLine();
                       if (acdc.equals("1")){
                           System.out.println("ဝယ်မှာသေချာလား ");
                           System.out.println("သေချာရင် 1 ကိုနှိပ်ပါ။");
                           System.out.println("မဝယ်ရင် 0 ကိုနှိပ်ပါ။");
                           System.out.print("Enter number : ");

                           String acdca = sc.nextLine();
                           if (acdca.equals("1")){
                               System.out.println("success");
                           }else if (acdca.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }

                       }else if (acdc.equals("2")){
                           System.out.println("ဝယ်မှာသေချာလား ");
                           System.out.println("သေချာရင် 1 ကိုနှိပ်ပါ။");
                           System.out.println("မဝယ်ရင် 0 ကိုနှိပ်ပါ။");
                           System.out.print("Enter number : ");

                           String acdcb = sc.nextLine();
                           if (acdcb.equals("1")){
                               System.out.println("success");
                           }else if (acdcb.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                   }
                   else if (acd.equals("0")){
                       System.out.println("Canceled");
                   }
               }
               else if (ac.equals("5")){
                   System.out.println("Enter 1 for ၁ ပတ်လုံး ၂၀ နိုင်ငံသို့ ဖုန်းခေါ် ၄၅၀ ကျပ်");
                   System.out.println("Enter 0 for cancel");
                   System.out.print("Enter number: ");

                   String ace = sc.nextLine();
                   if (ace.equals("1")){
                       System.out.println("၇ ရက်သုံး China | Thai | Malay နှင့် သတ်မှတ်နိုင်ငံ ၁ မိနစ် ၄၅ ကျပ် ");
                       System.out.println("Enter 1 to buy (450 MMK)");
                       System.out.println("Enter 0 to cancel");
                       System.out.print("Enter number: ");

                       String acea = sc.nextLine();
                       if (acea.equals("1")){
                           System.out.println("success");
                       }else if (acea.equals("0")){
                           System.out.println("Canceled");
                       }else {
                           System.out.println("Something Wrong");
                       }
                   }else if (ace.equals("0")){
                       System.out.println("Canceled");
                   }
               }
               else if (ac.equals("6")){
                   System.out.println("Enter 1 for အင်္ဂလိပ် အီဒီယမ်များ ");//now
                   System.out.println("Enter 2 for 7 Day သတင်း ");//now
                   System.out.println("Enter 3 for The Voice သတင်း");//now
                   System.out.println("Enter 4 for Cancel");//now
                   System.out.print("Enter number: ");

                   String acf = sc.nextLine();
                   if (acf.equals("1")){
                       System.out.println("အပတ်စဉ် ၃၁၅ ကျပ် ");
                       System.out.println("Enter 1 for ဇော်ဂျီဖြင့်ဝယ် ");
                       System.out.println("Enter 2 for ယူနီကုတ်ဖြင့်ဝယ်");
                       System.out.println("Enter 0 for cancel");
                       System.out.print("Enter number: ");

                       String acfa =sc.nextLine();
                       if (acfa.equals("1")){
                           System.out.println("Are you sure to buy this ?");
                           System.out.println("Enter 1 to buy ");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number: ");

                           String acfaa = sc.nextLine();
                           if (acfaa.equals("1")){
                               System.out.println("Success");
                           }else if (acfaa.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                       else if (acfa.equals("2")){
                           System.out.println("Are you sure to buy this ?");
                           System.out.println("Enter 1 to buy ");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number: ");

                           String acfab = sc.nextLine();
                           if (acfab.equals("1")){
                               System.out.println("Success");
                           }else if (acfab.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                       else if (acfa.equals("0")){
                           System.out.println("Canceled");
                       }

                   }else if (acf.equals("2")){
                       System.out.println("အပတ်စဉ် ၃၁၅ ကျပ် ");
                       System.out.println("Enter 1 for ဇော်ဂျီဖြင့်ဝယ် ");
                       System.out.println("Enter 2 for ယူနီကုတ်ဖြင့်ဝယ်");
                       System.out.println("Enter 0 for cancel");
                       System.out.print("Enter number: ");

                       String acfb =sc.nextLine();
                       if (acfb.equals("1")){
                           System.out.println("Are you sure to buy this ?");
                           System.out.println("Enter 1 to buy ");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number: ");

                           String acfba = sc.nextLine();
                           if (acfba.equals("1")){
                               System.out.println("Success");
                           }else if (acfba.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                       else if (acfb.equals("2")){
                           System.out.println("Are you sure to buy this ?");
                           System.out.println("Enter 1 to buy ");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number: ");

                           String acfbb = sc.nextLine();
                           if (acfbb.equals("1")){
                               System.out.println("Success");
                           }else if (acfbb.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                       else if (acfb.equals("0")){
                           System.out.println("Canceled");
                       }
                   }else if (acf.equals("3")){
                       System.out.println("အပတ်စဉ် ၃၁၅ ကျပ် ");
                       System.out.println("Enter 1 for ဇော်ဂျီဖြင့်ဝယ် ");
                       System.out.println("Enter 2 for ယူနီကုတ်ဖြင့်ဝယ်");
                       System.out.println("Enter 0 for cancel");
                       System.out.print("Enter number: ");

                       String acfc =sc.nextLine();
                       if (acfc.equals("1")){
                           System.out.println("Are you sure to buy this ?");
                           System.out.println("Enter 1 to buy ");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number: ");

                           String acfca = sc.nextLine();
                           if (acfca.equals("1")){
                               System.out.println("Success");
                           }else if (acfca.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                       else if (acfc.equals("2")){
                           System.out.println("Are you sure to buy this ?");
                           System.out.println("Enter 1 to buy ");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number: ");

                           String acfcb = sc.nextLine();
                           if (acfcb.equals("1")){
                               System.out.println("Success");
                           }else if (acfcb.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                       else if (acfc.equals("0")){
                           System.out.println("Canceled");
                       }
                   }else if (acf.equals("4")){
                       System.out.println("Canceled");
                   }
               }
               else if (ac.equals("7")){
                   System.out.println("တယ်လီနော SMS");
                   System.out.println("Enter 1 for အကန့်အသတ်မရှိ SMS");
                   System.out.println("Enter 3 for ၇ ရက်စာ ၅၀၀၀ SMS");
                   System.out.print("Enter number: ");

                   String acg = sc.nextLine();

                   if (acg.equals("1")){
                       System.out.println("အကန့်အသတ်မရှိ တယ်လီနောအချင်းချင်း SMS ည ၁၂ နာရီသက်တမ်းတိုး ");
                       System.out.println("Enter 1 to buy (၆၉ ကျပ် )");
                       System.out.print("Enter number: ");
                       String acga = sc.nextLine();
                       if (acga.equals("1")){
                           System.out.println("Are you  sure to buy");
                           System.out.println("Enter 1 to buy");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number :");
                           String acgaa = sc.nextLine();
                           if (acgaa.equals("1")){
                               System.out.println("Success");
                           }else if (acgaa.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }
                       }
                   }
                   else if (acg.equals("3")){
                       System.out.println("တယ်လီနော အချင်းချင်း ၅၀၀၀ SMS  - ၇ ရက်စာ");
                       System.out.println("Enter 1 to buy");
                       System.out.print("Enter number");
                       String acgb =sc.nextLine();
                       if (acgb.equals("1")){
                           System.out.println("Are you  sure to buy");
                           System.out.println("Enter 1 to buy");
                           System.out.println("Enter 0 to cancel");
                           System.out.print("Enter number :");
                           String acgba = sc.nextLine();
                           if (acgba.equals("1")){
                               System.out.println("Success");
                           }else if (acgba.equals("0")){
                               System.out.println("Canceled");
                           }else {
                               System.out.println("Something Wrong");
                           }

                       }

                   }
               }
           }

           else if (a.equals("3")){
               System.out.println("Enter 1 for လက်ကျန်စစ်ဆေးရန်  ");
               System.out.println("Enter 2 for ဆင်းကတ်မှတ်ပုံတင်စစ်ဆေးရန်");
               System.out.println("Enter 3 for Cancel");
               System.out.print("Enter a number ");
               String ae = sc.nextLine();
               if (ae.equals("1")){
                   System.out.println("ဆယ်မိနစ်အတွင်း လူကြီးမင်း၏ လက်ကျန်ငွေကို sms ပေးပို့ပါမည်။");
               }else if (ae.equals("2")){
                   System.out.println("အချက်အလက်များ စစ်ဆေးပြီး sms ပေးပို့ပါမည်။");
               }else if (ae.equals("3")){
                   System.out.println("Canceled");
               }else {
                   System.out.println("Something Wrong");
               }

           }
           else {
               System.out.println("Something Wrong");
           }
       }
       else {
           System.out.println("Input Number is Wrong!!");
       }
    }
}
