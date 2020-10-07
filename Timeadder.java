package eya;

import java.util.Arrays;
import java.lang.String;

public class Timeadder {
	
	static String[] labels = { "seconds", "minutes", "hours", "days", "second", "minute", "hour", "day" };
	
	public static String[] addFunction(int value1, String label1, int value2, String label2) {
		
		int vRes = 0;
		String lRes = "";
		
		// seconds * seconds (1)
		if (label1=="seconds" && value1!=1 && label2=="seconds" && value2!=1) {
			vRes = value1+value2;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				if (vRes == 1) lRes = "minute";
				else lRes= "minutes";
			}
		}
		
		// second * second (2)
		else if (label1=="second" && value1==1 && label2=="second" && value2==1) {
		    vRes = value1+value2;
			lRes = "seconds";
		}
		// second * seconds (3)
		else if (label1=="second" && value1==1 && label2=="seconds" && value2!=1) {
			vRes = value1+value2;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				if (vRes == 1) lRes = "minute";
				else lRes= "minutes";
			}
		}	
		
		// seconds * second (4)
		else if (label1=="seconds" && value1!=1 && label2=="second" && value2==1) {
			vRes = value1+value2;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				if (vRes == 1) lRes = "minute";
				else lRes= "minutes";
			}
		}	
		
		// Minutes * Minutes (5)
		else if (label1=="minutes" && value1!=1 && label2=="minutes" && value2!=1) {
			vRes = value1+value2;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				if (vRes == 1) lRes = "hour";
				else lRes= "hours";
			}
		}
		
		// Minute * Minute (6)
		else if (label1=="minute" && value1==1 && label2=="minute" && value2==1) {
			vRes = value1+value2;
			lRes = "minutes";
		}
		
		// minutes * minute (7)
		else if (label1=="minutes" && value1!=1 && label2=="minute" && value2==1) {
			vRes = value1+value2;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				if (vRes == 1) lRes = "hour";
				else lRes= "hours";
			}
		}
		
		// minute * minutes (8)
		else if (label1=="minute" && value1==1 && label2=="minutes" && value2!=1) {
			vRes = value1+value2;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				if (vRes == 1) lRes = "hour";
				else lRes= "hours";
			}
		}
		
		// hours * hours (9)
		else if (label1=="hours" && value1!=1 && label2=="hours" && value2!=1) {
			vRes = value1+value2;
			lRes = "hours";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				if (vRes == 1) lRes = "day";
				else lRes= "days";
			}
		}
		
		// hour * hour (10)
		else if (label1=="hour" && value1==1 && label2=="hour" && value2==1) {
			vRes = value1+value2;
			lRes = "hours";
		}
		
		// hour * hours (11)
		else if (label1=="hour" && value1==1 && label2=="hours" && value2!=1) {
			vRes = value1+value2;
			lRes = "hours";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				if (vRes == 1) lRes = "day";
				else lRes= "days";
			}
		}
	
		// hours * hour (12)
		else if (label1=="hours" && value1!=1 && label2=="hour" && value2==1) {
			vRes = value1+value2;
			lRes = "hours";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				if (vRes == 1) lRes = "day";
				else lRes= "days";
			}
		}
		
		// days * days (13)
		else if (label1=="days" && value1!=1 && label2=="days" && value1!=1) {
			vRes = value1+value2;
			lRes = "days";
			if ( vRes % 365 == 0 ) {
				vRes = vRes / 365;
				if (vRes == 1) lRes = "year";
				else lRes= "years";
			}
		}
		
		//  day * day (14)
		else if (label1=="day" && value1==1 && label2=="day" && value2==1) {
			vRes = value1+value2;
			lRes = "days";
		}
		
		// days * day (15)
		else if (label1=="days" && value1!=1 && label2=="day" && value2==1) {
			vRes = value1+value2;
			lRes = "days";
			if ( vRes % 365 == 0 ) {
				vRes = vRes / 365;
				if (vRes == 1) lRes = "year";
				else lRes= "years";
			}
		}
		
		// day * days (16)
		else if (label1=="day" && value1==1 && label2=="days" && value2!=1) {
			vRes = value1+value2;
			lRes = "days";
			if ( vRes % 365 == 0 ) {
				vRes = vRes / 365;
				if (vRes == 1) lRes = "year";
				else lRes= "years";
			}
		}
		
		// second * minute (17)
		else if (label1=="second" && value1==1 && label2=="minute" && value2==1) {
			vRes = value1+value2*60;
			lRes = "seconds";
		}
		
		// minute * second (18)
		else if (label1=="minute" && value1==1 && label2=="second" && value2==1) {
			vRes = value1*60+value2;
			lRes = "seconds";
		}
		
		// seconds * minute (19)
		else if (label1=="seconds" && value1!=1 && label2=="minute" && value2==1) {
			vRes = value1+value2*60;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "minutes";
			}
		}
		
		// minute * seconds (20)
		else if (label1=="minute" && value1==1 && label2=="seconds" && value2!=1) {
			vRes = value1*60+value2;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "minutes";
			}
		}
		
		// minutes * second (21)
		else if (label1=="minutes" && value1!=1 && label2=="second" && value2==1) {
			vRes = value1*60+value2;
			lRes = "seconds";
		}
		
	
	    // second * minutes (22)
		else if (label1=="second" && value1==1 && label2=="minutes" && value2!=1) {
			vRes = value1 + value2*60;
			lRes = "seconds";
		}

		// seconds * minutes (23)
		else if (label1=="seconds" && value1!=1 && label2=="minutes" && value2!=1) {
			vRes = value1 + value2*60;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "minutes";
			}
		}
		
		// minutes * seconds (24)
		else if (label1=="minutes" && value1!=1 && label2=="seconds" && value2!=1) {
			vRes = value1*60+value2;
			lRes = "seconds";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "minutes";
			}
		}
		
		// minute * hour (25)
		else if (label1=="minute" && value1==1 && label2=="hour" && value2==1) {
			vRes = value1+value2*60;
			lRes = "minutes";
		}
		
		// hour * minute (26)
		else if (label1=="hour" && value1==1 && label2=="minute" && value2==1) {
			vRes = value1*60+value2;
			lRes = "seconds";
		}
		
		// minutes * hour (27)
		else if (label1=="minutes" && value1!=1 && label2=="hour" && value2==1) {
			vRes = value1+value2*60;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "hours";
			}
		}
		
		// hour * minutes (28)
		else if (label1=="hour" && value1==1 && label2=="minutes" && value2!=1) {
			vRes = value1*60+value2;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "hours";
			}
		}
		
		// minute * hours (29)
		else if (label1=="minute" && value1==1 && label2=="hours" && value2!=1) {
			vRes = value1+value2*60;
			lRes = "minutes";
		}
		
		// hours * minute (30)
		else if (label1=="hours" && value1!=1 && label2=="minute" && value2==1) {
			vRes = value1*60+value2;
			lRes = "minutes";
		}
		
		// minutes * hours (31)
		else if (label1=="minutes" && value1!=1 && label2=="hours" && value2!=1) {
			vRes = value1+value2*60;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "hours";
			}
		}
		
		// hours * minutes (32)
		else if (label1=="hours" && value1!=1 && label2=="minutes" && value1!=1) {
			vRes = value1*60+value2;
			lRes = "minutes";
			if ( vRes % 60 == 0 ) {
				vRes = vRes / 60;
				lRes= "hours";
			}
		}
		
		// hour * day (33)
		else if (label1=="hour" && value1==1 && label2=="day" && value2==1) {
			vRes = value1+value2*24;
			lRes = "hours";
		}
		
		// day * hour (34)
		else if (label1=="day" && value1==1 && label2=="hour" && value2==1) {
			vRes = value1*24+value2;
			lRes = "hours";
		}
		
		// hours * day (35)
		else if (label1=="hours" && value1!=1 && label2=="day" && value2==1) {
			vRes = value1+value2*24;
			lRes = "hours";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				lRes= "days";
			}
		}
		
		// day * hours (36)
		else if (label1=="day" && value1==1 && label2=="hours" && value2!=1) {
			vRes = value1*24+value2;
			lRes = "minutes";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				lRes= "days";
			}
		}
		
		// hour * days (37)
		else if (label1=="hour" && value1==1 && label2=="days" && value2!=1) {
			vRes = value1+value2*24;
			lRes = "hours";
		}
		
		// days * hour (38)
		else if (label1=="days" && value1!=1 && label2=="hour" && value2==1) {
			vRes = value1*24+value2;
			lRes = "hours";
		}
		
		// hours * days (39)
		else if (label1=="hours" && value1!=1 && label2=="days" && value2!=1) {
			vRes = value1+value2*24;
			lRes = "hours";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				lRes= "days";
			}
		}
		
		// days * hours (40)
		else if (label1=="days" && value1!=1 && label2=="hours" && value2!=1) {
			vRes = value1*24+value2;
			lRes = "hours";
			if ( vRes % 24 == 0 ) {
				vRes = vRes / 24;
				lRes= "days";
			}
		}
		
	    //  hour * second (41)
		else if (label1=="hour" && value1==1 && label2=="sceond" && value2==1) {
			vRes = value1*3600+value2;
			lRes = "seconds";
		}
		
		// second * hour (42)
		else if (label1=="second" && value1==1 && label2=="hour" && value2==1) {
			vRes = value1+value2*3600;
			lRes = "seconds";
		}
		
		// seconds * hours (43)
		else if (label1=="seconds" && value1!=1 && label2=="hours" && value2!=1) {
			vRes = value1+value2*3600;
			lRes = "seconds";
		}
		
		// hours * seconds (44)
		else if (label1=="hours" && value1!=1 && label2=="seconds" && value2!=1) {
			vRes = value1*3600+value2;
			lRes = "seconds";
		} 
		
		// seconds * hour (45)
		else if (label1=="seconds" && value1!=1 && label2=="hour" && value2==1) {
			vRes = value1+value2*3600;
			lRes = "seconds";
			if (vRes%3600==0) {
				vRes = vRes/3600;
				lRes = "hours";
			}
		}
		
		// hour * seconds (46)
		else if (label1=="hour" && value1==1 && label2=="seconds" && value2!=1) {
			vRes = value1*3600+value2;
			lRes = "seconds";
			if (vRes%3600==0) {
				vRes = vRes/3600;
				lRes = "hours";
			}
		}
		
		// hours * second (47)
		else if (label1=="hours" && value1!=1 && label2=="second" && value2==1) {
			vRes = value1*3600+value2;
			lRes = "seconds";
		}
		
		// second * hours (48)
		else if (label1=="second" && value1==1 && label2=="hours" && value2!=1) {
			vRes = value1+value2*3600;
			lRes = "seconds";
		}
		
		// second * day (49)
		else if (label1=="second" && value1==1 && label2=="day" && value2==1) {
			vRes = value1+value2*3600*24;
			lRes = "seconds";
		}
		
		// day * second (50)
		else if (label1=="day" && value1==1 && label2=="second" && value2==1) {
			vRes = value1*3600*24+value2;
			lRes = "seconds";
		}
		
		// day * seconds (51)
		else if (label1=="day" && value1==1 && label2=="seconds" && value2!=1) {
			vRes = value1*3600*24+value2;
			lRes = "seconds";
			if (vRes%86400==0) {
				vRes = vRes/86400;
				lRes = "days";
			}
		}
		
		// seconds * day (52)
		else if (label1=="seconds" && value1!=1 && label2=="day" && value2==1) {
			vRes = value1+value2*3600*24;
			lRes = "seconds";
			if (vRes%86400==0) {
				vRes = vRes/86400;
				lRes = "days";
			}
		}
		
		// days * second (53)
		else if (label1=="days" && value1!=1 && label2=="second" && value2==1) {
			vRes = value1*3600*24+value2;
			lRes = "seconds";
		}
		
		// second * days (54)
		else if (label1=="second" && value1==1 && label2=="days" && value2!=1) {
			vRes = value1+value2*3600*24;
			lRes = "seconds";
		}
		
		// days * seconds (55)
		else if (label1=="days" && value1!=1 && label2=="seconds" && value2!=1) {
			vRes = value1*3600*24+value2;
			lRes = "seconds";
			if (vRes%86400==0) {
				vRes = vRes/86400;
				lRes = "days";
			}
		}
		
		// seconds * days (56)
		else if (label1=="seconds" && value1!=1 && label2=="days" && value2!=1) {
			vRes = value1+value2*3600*24;
			lRes = "seconds";
			if (vRes%86400==0) {
				vRes = vRes/86400;
				lRes = "days";
			}
		}
		
		// day * minute (57)
		else if (label1=="day" && value1==1 && label2=="minute" && value2==1) {
			vRes = value1*60*24+value2;
			lRes = "minutes";
		}
		
		// minute * day (58)
		else if (label1=="day" && value1==1 && label2=="minute" && value2==1) {
			vRes = value1+value2*60*24;
			lRes = "minutes";
		}
		
		// days * minute (59)
		else if (label1=="days" && value1!=1 && label2=="minute" && value2==1) {
			vRes = value1*60*24+value2;
			lRes = "minutes";
		}
		
		// minute * days (60)
		else if (label1=="minute" && value1==1 && label2=="days" && value2!=1) {
			vRes = value1+value2*24*60;
			lRes = "minutes";
		}
		
		// day * minutes (61)
		else if (label1=="day" && value1==1 && label2=="minutes" && value2!=1) {
			vRes = value1*60*24+value2;
			lRes = "minutes";
			if (vRes%1440==0) {
				vRes = vRes/1440;
				lRes = "days";
			}
		}
		
		// minutes * day (62)
		else if (label1=="minutes" && value1!=1 && label2=="day" && value2==1) {
			vRes = value1+value2*60*24;
			lRes = "minutes";
			if (vRes%1440==0) {
				vRes = vRes/1440;
				lRes = "days";
			}
		}
		
		// minutes * days (63)
		else if (label1=="minutes" && value1!=1 && label2=="days" && value2!=1) {
			vRes = value1+value2*24*60;
			lRes = "minutes";
			if (vRes%1440==0) {
				vRes = vRes/1440;
				lRes = "days";
			}
		}
		
		// days * minutes (64)
		else if (label1=="days" && value1!=1 && label2=="minutes" && value2!=1) {
			vRes = value1*60*24+value2;
			lRes = "minutes";
			if (vRes%1440==0) {
				vRes = vRes/1440;
				lRes = "days";
			}
		}
		
		// any other case
		else {
			vRes = 0;
			lRes = "0"; 
		}
		
		
		
	// end of cases
		
		String valueRes = Integer.toString(vRes);
		String resultat[] = {valueRes,lRes};
		
	// results
		return (resultat);
	}

	private static boolean contains(String[] labels, String label2) {
		for (int i=0; i<labels.length; i++) {
			if (labels[i]==label2)
				{return true;}
		}
		return false;
	}
	
	public static void affichage(String[] res) {
		if(res[0]!="0"&&res[1]!="0") {
			System.out.println(Arrays.toString(res));
		}
		else {
			System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		
			affichage(addFunction(7,"hours",20,"minutes"));
			affichage(addFunction(1,"hours",20,"minutes"));
			affichage(addFunction(50,"hours",22,"hours"));
			affichage(addFunction(2,"days",22,"hours"));
			affichage(addFunction(0,"hours",22,"hours"));
			affichage(addFunction(1,"day",25,"minutes"));
		
	}


}
