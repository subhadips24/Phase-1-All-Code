package virtualKey;


import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import virtualKey.FileUtility;




public class Operations implements FileUtility  {
	List<String> retrieve= new ArrayList<String>();
	File[] files = new File("E:\\Phase1\\Phase1\\FinalProject\\VirtualKey").listFiles();
	@Override
	public void showAllFiles() {
		
		for(File file : files) {
			if(file.isFile()) {
				retrieve.add(file.getName());
				System.out.println(file.getName());
			}
		}
		retrieve.forEach(System.out::println);

	}

	@Override
	public void addFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you want to add:");
		//sc.next();
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		try {
			if(F.createNewFile()) {
				System.out.println(filename+" file is added to the directory");
				Desktop.getDesktop().edit(F);
			}
			else {
				System.out.println("This file is already there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

	@Override
	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you want to delete:");
		//sc.next();
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		if(F.delete())
			System.out.println(filename+" got Deleted");
		else
			System.out.println("File Not Found");
	}
	
	
	
	@Override
	public void searchFile() throws FileNotFoundException{
		Scanner scan= new Scanner(System.in);
		File directory = new File("E:\\\\Phase1\\\\Phase1\\\\FinalProject\\\\VirtualKey");
		System.out.println("Enter the file name which you want to search:");
		String fileName=scan.nextLine();
		File[] files=directory.listFiles();
		int flag=0;
		for (File file : files) {
			 
		     if (fileName.equalsIgnoreCase(file.getName()))
		     {
		         System.out.println("File saved at " + file.getParentFile());
		         System.out.println("Contents inside the file :\n");
		         @SuppressWarnings("resource")
				Scanner sc1 = new Scanner(file);
		         while(sc1.hasNextLine()) {
        				System.out.println(sc1.nextLine());
        				}
		         
		         flag = 1;
		     }
		    
		}
      if(flag==0) {
		System.out.println("File not found");
      }

	}


}