import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {

        List<Employee> employeeList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        List<String> allLines = new ArrayList<>();

        String line;
        try{
            while ((line = br.readLine())!=null){
                //store string values in list
                allLines.add(line);
            }
            br.close();
            
            //remove 1st row of string ("id","name", "age")
            allLines = allLines.stream()
                    .skip(1)
                    .collect(Collectors.toList());

            //spilt the lines and parse the data
            for(String values : allLines){
                String [] data = values.split(",");
                Integer id = Integer.parseInt(data[0]);
                String name = data[1];
                Integer age = Integer.parseInt(data[2]);

                //Create new employee and add to the employeeList
                employeeList.add(new Employee(id,name,age));
            }

            //Print the data
            for(Employee emp : employeeList){
                System.out.println("Id: "+emp.getId()+" Name: "+emp.getName()+" Age: "+emp.getAge());
            }

        }catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}
