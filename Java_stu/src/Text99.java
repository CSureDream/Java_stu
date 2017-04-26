import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Text99 {
	public void print() throws Exception {
		// object   序列化输出到99.object
		FileOutputStream fos1 = new FileOutputStream("99.object");
		ObjectOutputStream oos = new ObjectOutputStream(fos1);
		for(int i = 1;i<=9;i++){                
	        for(int j = 1;j<=i;j++){             
	           oos.writeObject(j+"*"+i+"="+ j*i + " \t"); 
	               }    
	        oos.writeObject(null);
	         } 
		
		//PrintStream shuchu 到 e：99.txt
		PrintStream fos = new PrintStream("E:\\99.txt");
				for(int i = 1;i<=9;i++){                
	        for(int j = 1;j<=i;j++){             
	           fos.print(j+"*"+i+"="+ j*i + " \t"); 
	               }    
	                fos.println();
	         } 
	
	}
}

