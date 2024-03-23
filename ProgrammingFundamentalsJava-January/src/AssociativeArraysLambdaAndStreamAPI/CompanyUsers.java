package AssociativeArraysLambdaAndStreamAPI;
/*
@CIHAN GUR

Write a program which keeps the information about companies and their employees.
You will receive company names and an employees' id until you receive the "End" command.
Add each employee to the given company. Keep in mind that a company cannot
have two employees with the same id.
Print the company name and each employee's id in the following format:
"{company_name}
-- {id1}
-- {id2}
…
-- {idN}"
Input / Constraints
Until you receive "End", the input come in the format: "{companyName} -> {employeeId}".
The input always will be valid.

INPUT
SoftUni -> AA12345
SoftUni -> BB12345
Microsoft -> CC12345
HP -> BB12345
End
OUTPUT
SoftUni
-- AA12345
-- BB12345
Microsoft
-- CC12345
HP
-- BB12345

INPUT
SoftUni -> AA12345
SoftUni -> CC12344
Lenovo -> XX23456
SoftUni -> AA12345
Movement -> DD11111
End
OUTPUT
SoftUni
-- AA12345
-- CC12344
Lenovo
-- XX23456
Movement
-- DD11111

*/
import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        Map<String, List<String>> companyRecords = new LinkedHashMap<>();

        while (!data.equals("End")) {
            String companyName = data.split(" -> ")[0];
            String companyId = data.split(" -> ")[1];

            if (companyRecords.containsKey(companyName)) {
                if (!companyRecords.get(companyName).contains(companyId)) {
                    companyRecords.get(companyName).add(companyId);
                }
            } else {
                companyRecords.put(companyName, new ArrayList<>());
                companyRecords.get(companyName).add(companyId);
            }

            data = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> user : companyRecords.entrySet()) {
            String companyName = user.getKey();
            List<String> companyIds = user.getValue();
            System.out.println(companyName);
            companyIds.forEach(id -> System.out.println("-- " + id));
        }
    }
}