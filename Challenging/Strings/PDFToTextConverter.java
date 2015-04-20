package learnapachepoi;

// to run this file on your system, remove the package name.

/**
 *
 * @author kavish
 * 
 * NOTE : This code is implemented using iText Java Library
 * it convert pdf files to the user defined format
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;

@SuppressWarnings("PDFToTextConverter")
public class PDFToTextConverter{
    
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
        selectPDFFiles();
        
        long endTime = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.println("Total time to execute : "+TotalTime);
    }


// allow pdf files selection for converting
    public static void selectPDFFiles(){
        
        System.out.println("---------- INSIDE : selectPDFFiles ----------");

        JFileChooser chooser = new JFileChooser();

        // you can change the file extension acccording to your needs
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF","pdf");
        
        chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(true);
        
        int returnVal = chooser.showOpenDialog(null);

        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File[] Files=chooser.getSelectedFiles();
            System.out.println("Please wait...");
            
            for( int i=0;i<Files.length;i++){    
                System.out.println(" Printing i : "+i);
                
                // the code will basically overwrite the existing same name files
                
// this is incorrect, remove if you want.
//                if(!Files[i].exists()){
//                    System.out.println(" File does not exists ");
//                    //Files[i].createNewFiles();
//                }
                String filename = Files[i].getName();
                String basename = FilenameUtils.getBaseName(filename);
                convertPDFToText(Files[i].toString(), basename+".txt");
                //convertPDFToText(Files[i].toString(),"textfrompdf"+i+".txt");
            }
            System.out.println("Conversion complete");
        }     
    }

    public static void convertPDFToText(String src,String desc){
        try{
            
            System.out.println(" Printing string 'src' : "+src);
            System.out.println(" Printing string 'desc' : "+desc);
            //create file writer
            FileWriter fw=new FileWriter(desc);

            //File file = new File();
            //create buffered writer
            BufferedWriter bw=new BufferedWriter(fw);

            //create pdf reader
            PdfReader pr=new PdfReader(src);

            //get the number of pages in the document
            int pNum=pr.getNumberOfPages();

            //extract text from each page and write it to the output text file
            for(int page=1;page<=pNum;page++){
                String text=PdfTextExtractor.getTextFromPage(pr, page);
                bw.write(text);
                bw.newLine();
            }
            bw.flush();
            bw.close();

        }catch(Exception e){
            System.out.println("Exception Caught");
            e.printStackTrace();
        }

    }

}