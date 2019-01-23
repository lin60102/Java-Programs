import java.io.*;

class choose{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int moviename;
		String hour1="",min1="",hour2="",min2="";
		String [] movie={"       大隻佬2      ","     斷背回憶錄     ","時間停止器之透明人間",
			"     制服婦產科     ","      人妻餘生      ","     修女壞東西     "};
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
			System.out.println("售票員:大隻佬2，有以下的播映時段");
			System.out.println("第1場:08:00~10:10");
			System.out.println("第2場:10:40~12:50");
			System.out.println("第3場:13:20~15:30");
			System.out.println("第4場:16:00~18:10");
			System.out.println("第5場:18:40~20:50");
			System.out.println("第6場:21:20~23:30");
			System.out.println("售票員:請問你要選擇哪個場次?");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這個時段咩!");
			System.out.print("售票員:再給你選擇一次喔~"); 
			}
			}while(times>6|times<1);
			break;
			}
			case 2 :{
			int times;
			do{
			System.out.println("");
			System.out.println("售票員:斷背回憶錄，有以下的播映時段");	
			System.out.println("第1場:08:00~09:50");
			System.out.println("第2場:10:20~12:10");
			System.out.println("第3場:12:40~14:30");
			System.out.println("第4場:15:00~16:50");
			System.out.println("第5場:17:20~19:10");
			System.out.println("第6場:19:40~21:30");
			System.out.println("第7場:22:00~23:50");
			System.out.println("售票員:請問你要選擇哪個場次?");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這個時段咩!");
			System.out.print("售票員:再給你選擇一次喔~"); 
			}
		  }while(times>7|times<1);
		  break;
			}
			case 3 :{
			int times;
			do{
			System.out.println("");
			System.out.println("售票員:時間停止器之透明人間，有以下的播映時段");
			System.out.println("第1場:08:20~09:50");
			System.out.println("第2場:10:20~11:50");
			System.out.println("第3場:12:20~13:50");
			System.out.println("第4場:14:20~15:50");
			System.out.println("第5場:16:20~17:50");
			System.out.println("第6場:18:20~19:50");
			System.out.println("第7場:20:20~21:50");
			System.out.println("第8場:22:20~23:50");
			System.out.println("售票員:請問你要選擇哪個場次?");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這個時段咩!");
			System.out.print("售票員:再給你選擇一次喔~"); 
	   	}
			}while(times>8|times<1);
			break;
			}
			case 4 :{
			int times;
			do{
			System.out.println("");
			System.out.println("售票員:制服婦產科，有以下的播映時段");
			System.out.println("第1場:08:20~09:50");
			System.out.println("第2場:10:20~11:50");
			System.out.println("第3場:12:20~13:50");
			System.out.println("第4場:14:20~15:50");
			System.out.println("第5場:16:20~17:50");
			System.out.println("第6場:18:20~19:50");
			System.out.println("第7場:20:20~21:50");
			System.out.println("第8場:22:20~23:50");
			System.out.println("售票員:請問你要選擇哪個場次?");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這個時段咩!");
			System.out.print("售票員:再給你選擇一次喔~"); 
	    }
			}while(times>8|times<1);
			break;
			}
			case 5 :{
			int times;
			do{
			System.out.println("");
			System.out.println("售票員:人妻餘生，有以下的播映時段");
			System.out.println("第1場:08:00~10:30");
			System.out.println("第2場:11:00~13:30");
			System.out.println("第3場:14:00~16:30");
			System.out.println("第4場:17:00~19:30");
			System.out.println("第5場:20:00~22:30");
			System.out.println("第6場:23:00~01:30");
			System.out.println("售票員:請問你要選擇哪個場次?");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這個時段咩!");
			System.out.print("售票員:再給你選擇一次喔~"); 
      }
			}while(times>6|times<1);
			break;
			}
			case 6 :{
			int times;
			do{
			System.out.println("");
			System.out.println("售票員:修女壞東西，有以下的播映時段");
			System.out.println("第1場:08:00~09:30");
			System.out.println("第2場:10:00~11:30");
			System.out.println("第3場:12:00~13:30");
			System.out.println("第4場:14:00~15:30");
			System.out.println("第5場:16:00~17:30");
			System.out.println("第6場:18:00~19:30");
			System.out.println("第7場:20:00~21:30");
			System.out.println("第8場:22:00~23:30");
			System.out.println("售票員:請問你要選擇哪個場次?");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這個時段咩!");
			System.out.print("售票員:再給你選擇一次喔~"); 
	    }
			}while(times>8|times<1);
			break;
			}
			default:
			System.out.println("");
			System.out.println("售票員:同學你來亂的喔~就沒有這個電影廳喔!");
      System.out.println("售票員:再給你選擇一次喔~");
			System.out.println("");
			break;
			}
			}while(moviename>6|moviename<1);
	}
	void choosemethod2()throws IOException{
		System.out.println("");
		System.out.println("售票員:同學選完場次開始選位子囉!");
		do{
			System.out.println("售票員:請問要哪一排呢?(共10排)");
		  row = Integer.parseInt(br.readLine());
		while(row>10|row<1){
		  System.out.println("");
			System.out.println("售票員:同學你來亂的喔~就沒有這一排咩!");
      System.out.println("售票員:再給你選擇一次喔~");
			break;
		  }
		  }while(row>10|row<1);
    do{
			System.out.println("售票員:請問要哪一列呢?(a,b,c,d,e共5列)");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
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
			System.out.println("售票員:同學你來亂的喔~就沒有這一列咩!");
			System.out.println("售票員:再給你選擇一次喔~");
			}
			break;
			}
			}
			}while(line!='a'&line!='b'&line!='c'&line!='d'&line!='e');
	}
	}
class output extends choose{
	void outputmethod(){
		    System.out.println("售票員:你的票在這請收下~");
		    System.out.println("      ****************************************");
			System.out.println("      *                  "+moviename+"廳                 *");
			System.out.println("      *              "+hour1+":"+min1+"~"+hour2+":"+min2+"             *");
			System.out.println("      *          "+movie[moviename-1]+"        *");
			System.out.println("      *              你的列數:"+line+"列            *");
			System.out.println("      *              你的排數:"+row1+"排           *");
			System.out.println("      ****************************************");
	}
	}

public class hw {
	public static void main(String [] args)throws IOException{
		System.out.println("售票員:現正熱映中");
		System.out.println("1廳:大隻佬2    2廳:斷背回憶錄 3廳:時間停止器之透明人間 ");
		System.out.println("4廳:制服婦產科 5廳:人妻餘生   6廳:修女壞東西");
		System.out.println("售票員:請問你想看什麼電影?");
		System.out.println("");
		output call1 = new output();
		call1.choosemethod1();
		call1.choosemethod2();
		call1.outputmethod();
		  }
		  }