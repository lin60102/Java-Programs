import java.io.*;

class choose{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int moviename;
		String hour1="",min1="",hour2="",min2="";
		String [] movie={"       �j����2      ","     �_�I�^�п�     ","�ɶ�������z���H��",
			"     ��A������     ","      �H�d�l��      ","     �פk�a�F��     "};
		String row1="";
		char line;
		int row;
	void choosemethod1()throws IOException{
		do{
		moviename =Integer.parseInt(br.readLine());
    switch(moviename){
			case 1 :{
			int times;
			do{
			System.out.println("");
			System.out.println("�Ⲽ��:�j����2�A���H�U�����M�ɬq");
			System.out.println("��1��:08:00~10:10");
			System.out.println("��2��:10:40~12:50");
			System.out.println("��3��:13:20~15:30");
			System.out.println("��4��:16:00~18:10");
			System.out.println("��5��:18:40~20:50");
			System.out.println("��6��:21:20~23:30");
			System.out.println("�Ⲽ��:�аݧA�n��ܭ��ӳ���?");
			System.out.println("");
		  times =Integer.parseInt(br.readLine());
		  if (times == 1){
		   hour1 = "08";
		    min1 = "00";
		   hour2 = "10";
		    min2 = "10";
		  }
		  else if (times == 2){
		   hour1 = "10";
		    min1 = "40";
		   hour2 = "12";
		    min2 = "50";
		  }
		  else if (times == 3){
		   hour1 = "13";
		    min1 = "20";
		   hour2 = "15";
		    min2 = "30";
		  }
		  else if (times == 4){
		   hour1 = "16";
		    min1 = "00";
		   hour2 = "18";
		    min2 = "10";
		  }
		  else if (times == 5){
		   hour1 = "18";
		    min1 = "40";
		   hour2 = "20";
		    min2 = "50";
		  }
		  else if (times == 6){
		   hour1 = "21";
		    min1 = "20";
		   hour2 = "23";
		    min2 = "30";
		  }
		  else{
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�Ӯɬq��!");
			System.out.print("�Ⲽ��:�A���A��ܤ@����~"); 
			}
			}while(times>6|times<1);
			break;
			}
			case 2 :{
			int times;
			do{
			System.out.println("");
			System.out.println("�Ⲽ��:�_�I�^�п��A���H�U�����M�ɬq");	
			System.out.println("��1��:08:00~09:50");
			System.out.println("��2��:10:20~12:10");
			System.out.println("��3��:12:40~14:30");
			System.out.println("��4��:15:00~16:50");
			System.out.println("��5��:17:20~19:10");
			System.out.println("��6��:19:40~21:30");
			System.out.println("��7��:22:00~23:50");
			System.out.println("�Ⲽ��:�аݧA�n��ܭ��ӳ���?");
			System.out.println("");
			times =Integer.parseInt(br.readLine());
		  if (times == 1){
		   hour1 = "08";
		    min1 = "00";
		   hour2 = "09";
		    min2 = "50";
		  }
		  else if (times == 2){
		   hour1 = "10";
		    min1 = "20";
		   hour2 = "12";
		    min2 = "10";
		  }
		  else if (times == 3){
		   hour1 = "12";
		    min1 = "40";
		   hour2 = "14";
		    min2 = "30";
		  }
		  else if (times == 4){
		   hour1 = "15";
		    min1 = "00";
		   hour2 = "16";
		    min2 = "50";
		  }
		  else if (times == 5){
		   hour1 = "17";
		    min1 = "20";
		   hour2 = "19";
		    min2 = "10";
		  }
		  else if (times == 6){
		   hour1 = "19";
		    min1 = "40";
		   hour2 = "21";
		    min2 = "30";
		  }
		  else if (times == 7){
		   hour1 = "22";
		    min1 = "00";
		   hour2 = "23";
		    min2 = "50";
		  }
		  else{
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�Ӯɬq��!");
			System.out.print("�Ⲽ��:�A���A��ܤ@����~"); 
			}
		  }while(times>7|times<1);
		  break;
			}
			case 3 :{
			int times;
			do{
			System.out.println("");
			System.out.println("�Ⲽ��:�ɶ�������z���H���A���H�U�����M�ɬq");
			System.out.println("��1��:08:20~09:50");
			System.out.println("��2��:10:20~11:50");
			System.out.println("��3��:12:20~13:50");
			System.out.println("��4��:14:20~15:50");
			System.out.println("��5��:16:20~17:50");
			System.out.println("��6��:18:20~19:50");
			System.out.println("��7��:20:20~21:50");
			System.out.println("��8��:22:20~23:50");
			System.out.println("�Ⲽ��:�аݧA�n��ܭ��ӳ���?");
			System.out.println("");
			times =Integer.parseInt(br.readLine());
	 	  if (times == 1){
		   hour1 = "08";
		    min1 = "20";
		   hour2 = "09";
		    min2 = "50";
		  }
		  else if (times == 2){
		   hour1 = "10";
		    min1 = "20";
		   hour2 = "11";
		    min2 = "50";
		  }
		  else if (times == 3){
		   hour1 = "12";
		    min1 = "20";
		   hour2 = "13";
		    min2 = "50";
		  }
		  else if (times == 4){
		   hour1 = "14";
		    min1 = "20";
		   hour2 = "15";
		    min2 = "50";
		  }
		  else if (times == 5){
		   hour1 = "16";
		    min1 = "20";
		   hour2 = "17";
		    min2 = "50";
		  }
		  else if (times == 6){
		   hour1 = "18";
		    min1 = "20";
		   hour2 = "19";
		    min2 = "50";
		   }
		  else if (times == 7){
		   hour1 = "20";
		    min1 = "20";
		   hour2 = "21";
		    min2 = "50";
		  }
		  else if (times == 8){
		   hour1 = "22";
		    min1 = "20";
		   hour2 = "23";
		    min2 = "50";
		  }
		  else{
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�Ӯɬq��!");
			System.out.print("�Ⲽ��:�A���A��ܤ@����~"); 
	   	}
			}while(times>8|times<1);
			break;
			}
			case 4 :{
			int times;
			do{
			System.out.println("");
			System.out.println("�Ⲽ��:��A������A���H�U�����M�ɬq");
			System.out.println("��1��:08:20~09:50");
			System.out.println("��2��:10:20~11:50");
			System.out.println("��3��:12:20~13:50");
			System.out.println("��4��:14:20~15:50");
			System.out.println("��5��:16:20~17:50");
			System.out.println("��6��:18:20~19:50");
			System.out.println("��7��:20:20~21:50");
			System.out.println("��8��:22:20~23:50");
			System.out.println("�Ⲽ��:�аݧA�n��ܭ��ӳ���?");
			System.out.println("");
			times =Integer.parseInt(br.readLine());
	    if (times == 1){
	     hour1 = "08";
		    min1 = "20";
		   hour2 = "09";
		    min2 = "50";
		  }
		  else if (times == 2){
		   hour1 = "10";
		    min1 = "20";
		   hour2 = "11";
		    min2 = "50";
		  }
		  else if (times == 3){
		   hour1 = "12";
		    min1 = "20";
		   hour2 = "13";
		    min2 = "50";
		  }
		  else if (times == 4){
		   hour1 = "14";
		    min1 = "20";
		   hour2 = "15";
		    min2 = "50";
		  }
		  else if (times == 5){
		   hour1 = "16";
		    min1 = "20";
		   hour2 = "17";
		    min2 = "50";
		  }
		  else if (times == 6){
		   hour1 = "18";
		    min1 = "20";
		   hour2 = "19";
		    min2 = "50";
		  }
		  else if (times == 7){
		   hour1 = "20";
		    min1 = "20";
		   hour2 = "21";
		    min2 = "50";
		  }
		  else if (times == 8){
		   hour1 = "22";
		    min1 = "20";
		   hour2 = "23";
		    min2 = "50";
		  }
		  else{
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�Ӯɬq��!");
			System.out.print("�Ⲽ��:�A���A��ܤ@����~"); 
	    }
			}while(times>8|times<1);
			break;
			}
			case 5 :{
			int times;
			do{
			System.out.println("");
			System.out.println("�Ⲽ��:�H�d�l�͡A���H�U�����M�ɬq");
			System.out.println("��1��:08:00~10:30");
			System.out.println("��2��:11:00~13:30");
			System.out.println("��3��:14:00~16:30");
			System.out.println("��4��:17:00~19:30");
			System.out.println("��5��:20:00~22:30");
			System.out.println("��6��:23:00~01:30");
			System.out.println("�Ⲽ��:�аݧA�n��ܭ��ӳ���?");
			System.out.println("");
			times =Integer.parseInt(br.readLine());
			if (times == 1){
		   hour1 = "08";
		    min1 = "00";
		   hour2 = "10";
		    min2 = "30";
		  }
		  else if (times == 2){
		   hour1 = "11";
		    min1 = "00";
		   hour2 = "13";
		    min2 = "30";
		  }
		  else if (times == 3){
		   hour1 = "14";
		    min1 = "00";
		   hour2 = "16";
		    min2 = "30";
		  }
		  else if (times == 4){
		   hour1 = "17";
		    min1 = "00";
		   hour2 = "19";
		    min2 = "30";
		  }
		  else if (times == 5){
		   hour1 = "20";
		    min1 = "00";
		   hour2 = "22";
		    min2 = "30";
		  }
		  else if (times == 6){
		   hour1 = "23";
		    min1 = "00";
		   hour2 = "01";
		    min2 = "30";
		  }
		  else{
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�Ӯɬq��!");
			System.out.print("�Ⲽ��:�A���A��ܤ@����~"); 
      }
			}while(times>6|times<1);
			break;
			}
			case 6 :{
			int times;
			do{
			System.out.println("");
			System.out.println("�Ⲽ��:�פk�a�F��A���H�U�����M�ɬq");
			System.out.println("��1��:08:00~09:30");
			System.out.println("��2��:10:00~11:30");
			System.out.println("��3��:12:00~13:30");
			System.out.println("��4��:14:00~15:30");
			System.out.println("��5��:16:00~17:30");
			System.out.println("��6��:18:00~19:30");
			System.out.println("��7��:20:00~21:30");
			System.out.println("��8��:22:00~23:30");
			System.out.println("�Ⲽ��:�аݧA�n��ܭ��ӳ���?");
			System.out.println("");
			times =Integer.parseInt(br.readLine());
			if (times == 1){
		   hour1 = "08";
		    min1 = "00";
		   hour2 = "09";
		    min2 = "30";
		  }
		  else if (times == 2){
		   hour1 = "10";
		    min1 = "00";
		   hour2 = "11";
		    min2 = "30";
		  }
		  else if (times == 3){
		   hour1 = "12";
		    min1 = "00";
		   hour2 = "13";
		    min2 = "30";
		  }
		  else if (times == 4){
		   hour1 = "14";
		    min1 = "00";
		   hour2 = "15";
		    min2 = "30";
		  }
		  else if (times == 5){
		   hour1 = "16";
		    min1 = "00";
		   hour2 = "17";
		    min2 = "30";
		  }
		  else if (times == 6){
		   hour1 = "18";
		    min1 = "00";
		   hour2 = "19";
		    min2 = "30";
		  }
		  else if (times == 7){
		   hour1 = "20";
		    min1 = "00";
		   hour2 = "21";
		    min2 = "30";
		  }
		  else if (times == 8){
		   hour1 = "22";
		    min1 = "00";
		   hour2 = "23";
		    min2 = "30";
		  }
		  else{
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�Ӯɬq��!");
			System.out.print("�Ⲽ��:�A���A��ܤ@����~"); 
	    }
			}while(times>8|times<1);
			break;
			}
			default:
			System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�ӹq�v�U��!");
      System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			System.out.println("");
			break;
			}
			}while(moviename>6|moviename<1);
	}
	void choosemethod2()throws IOException{
		System.out.println("");
		System.out.println("�Ⲽ��:�P�ǿ粒�����}�l���l�o!");
		do{
			System.out.println("�Ⲽ��:�аݭn���@�ƩO?(�@10��)");
		  row = Integer.parseInt(br.readLine());
		while(row>10|row<1){
		  System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�ƫ�!");
      System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			break;
		  }
		  }while(row>10|row<1);
    do{
			System.out.println("�Ⲽ��:�аݭn���@�C�O?(a,b,c,d,e�@5�C)");
		  System.out.println("");
		  line = br.readLine().charAt(0);
    switch(row){ 
	    case 1 :{
	    row1="01";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
	    }
	    case 2 :{	
	    row1="02";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
	    }
	    case 3 :{
	    row1="03";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
	    }
	    case 4 :{
	    row1="04";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
			}
	    case 5 :{
	    row1="05";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
			}
	    case 6 :{
	    row1="06";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
			}
	    case 7 :{
	    row1="07";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
	    }
	    case 8 :{
	    row1="08";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
			}
	    case 9 :{
	    row1="09";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
			}
			case 10 :{
	    row1="10";
	    if(line == 'a'){
	    	break;
	    }
	    else if(line == 'b'){
	    	break;
	    }
	    else if(line == 'c'){
	    	break;
	    }
	    else if(line == 'd'){
	    	break;
	    }
	    else if(line == 'e'){
	    	break;
	    }
	    else{
	    System.out.println("");
			System.out.println("�Ⲽ��:�P�ǧA�Ӷê���~�N�S���o�@�C��!");
			System.out.println("�Ⲽ��:�A���A��ܤ@����~");
			}
			break;
			}
			}
			}while(line!='a'&line!='b'&line!='c'&line!='d'&line!='e');
	}
	}
class output extends choose{
	void outputmethod(){
		    System.out.println("�Ⲽ��:�A�����b�o�Ц��U~");
		    System.out.println("      ****************************************");
			System.out.println("      *                  "+moviename+"�U                 *");
			System.out.println("      *              "+hour1+":"+min1+"~"+hour2+":"+min2+"             *");
			System.out.println("      *          "+movie[moviename-1]+"        *");
			System.out.println("      *              �A���C��:"+line+"�C            *");
			System.out.println("      *              �A���Ƽ�:"+row1+"��           *");
			System.out.println("      ****************************************");
	}
	}

public class hw {
	public static void main(String [] args)throws IOException{
		System.out.println("�Ⲽ��:�{�����M��");
		System.out.println("1�U:�j����2    2�U:�_�I�^�п� 3�U:�ɶ�������z���H�� ");
		System.out.println("4�U:��A������ 5�U:�H�d�l��   6�U:�פk�a�F��");
		System.out.println("�Ⲽ��:�аݧA�Q�ݤ���q�v?");
		System.out.println("");
		output call1 = new output();
		call1.choosemethod1();
		call1.choosemethod2();
		call1.outputmethod();
		  }
		  }