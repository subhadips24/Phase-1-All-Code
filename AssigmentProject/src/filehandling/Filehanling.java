package filehandling;

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;

	public class Filehanling {

		public static void main(String[] args) throws IOException {
			CreateFileClass();
			ReadFileClass();
			DeleteFileClass();
			appendFileClass();
		}
		
		//Here we can creating file file.txt
		private static void CreateFileClass() throws IOException {
			File file = new File("file.txt");
			if(file.createNewFile()) {
				System.out.println("File Create Succefully!!!");
			}else if(file.isFile()){
				System.out.println("File is already Exits..");
			}else {
				System.out.println("File is not Created");
			}
			FileWriter write = new FileWriter("file.txt");
			write.write("Hello Simply Learning. Java Full Stack Developer");
			write.write("File Creating,Deleting,Reading operation are perfromed");
			write.close();		
			System.out.println("\n");
		}
		//Here we can read the file
		private static void ReadFileClass() throws IOException {
			File file = new File("file.txt");
	        try {
	            Scanner sc = new Scanner(file);
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                System.out.println("You can Read Your File:\n"+line);
	            }
	            sc.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
		}
		
	//here i m creating one more file and that file i going deleting
		private static void DeleteFileClass() throws IOException {
			//creating file
			File file = new File("readwrite.txt");//creating one file deleting that file only
			if(file.createNewFile()) {
				System.out.println("File Create Succefully!!!");
			}else if(file.isFile()){
				System.out.println("File is already Exits..");
			}else {
				System.out.println("File is not Created");
			}
			//deleting file readwrite
			if(file.delete())
			{
				System.out.println("File Succesfully Deleted.."+file.getName());
			}
			else {
				System.out.println("File Not! deleted so please Try again...");
			}
			
		}
		private static void appendFileClass() throws IOException{
			//re-writing the file which one deleted before in deleted operation
			FileWriter fw = new FileWriter("readwrite.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			System.out.println("File Successfully Append");
		    
		    FileWriter write = new FileWriter("readwrite.txt");
			write.write("Hello Simply Learning. Java Full Stack Developer");
			write.write("File Creating,Deleting,Reading operation are perfromed");
			write.close();	    
		   
		}
				  
	}
