import java.util.*;

// EmployeeBadgeApp
// TESCO
public class App {

    private static enum Status {
        exit, enter;
    }

    private static class Employee {
        String name;
        Status status;
    }

    public static void main(String[] args) {

        // repeated enter or repeated exit in invalid
        // first entry as exit is invalid
        // last entry having enter must be entered into enter collection to show employee not used the badge for exit.




        String[][] emps = {
                {"Martha", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Paul", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Paul", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Martha", "exit"}
        };

        emps = new String[][]{
                {"paul", "enter"},
                {"paul", "exit"},
                {"paul", "enter"},
                {"paul", "exit"},
        }; // [] []

        emps = new String[][]{
                {"paul", "enter"},
                {"paul", "enter"},
                {"paul", "enter"},
                {"paul", "exit"},
        }; // [paul] []
        /**
         * enter is repeated
         */

        emps = new String[][]{
                {"paul", "enter"},
                {"paul", "exit"},
                {"paul", "exit"},
        }; // [] [paul]
        /**
         * exit showing because it is repeated
         */

        emps = new String[][]{
                {"paul", "enter"},
                {"paul", "exit"},
                {"paul", "enter"},
        }; // [paul] []
        /**
         * enter is showing because the employee not used badge for exit
         */

        emps = new String[][]{
                {"paul", "enter"},
                {"paul", "enter"},
                {"paul", "exit"},
                {"paul", "exit"},
        }; // [paul] [paul]
        /**
         *  enter is showing because it is repeated
         *  exit is showing because it is repeated
         */

        emps = new String[][]{
                {"paul", "enter"},
                {"paul", "exit"},
                {"paul", "exit"},
                {"paul", "enter"},
                {"paul", "exit"},
        }; // [] [paul]
        /**
         *  exit is showing because repeated
         */

        emps = new String[][]{
                {"paul", "exit"},
                {"paul", "enter"},
                {"paul", "exit"},
        }; // [] [paul]
        /**
         * exit is invalid as it is first entered.
         */

        emps = new String[][]{
                {"paul", "exit"},
                {"paul", "enter"},
        }; // [paul] [paul]

        /**
         * exit is invalid as it is first entry
         * enter showing as the employee not used badge for exit
         */
        Arrays.sort(emps, Comparator.comparing(e -> e[0]));

        Map<String, Employee> employeeMap = new HashMap<>();

        Set<String> enterCollection = new HashSet<>(); // invalid enter state: consecutive enter to go into this collection
        Set<String> exitCollection = new HashSet<>(); // invalid exit state: consecutive exit to go into this collection. if first entry exit also it will go to this collection

        for (String[] element : emps) {
            // System.out.println(Arrays.toString(element));
            String empName = element[0];
            Status status = Status.valueOf(element[1]);
            if (employeeMap.containsKey(empName)) {
                Employee e = employeeMap.get(empName);
                if (e.status == Status.exit && status == Status.exit) // invalid state
                    exitCollection.add(empName);
                if (e.status == Status.enter && status == Status.enter) // invalid state
                    enterCollection.add(empName);

//                if(e.status == Status.exit && status == Status.enter)
//                    enterCollection.add(empName);
                e.status = status;
            } else {
                Employee e = new Employee();
                e.name = empName;
                e.status = status;
                employeeMap.put(empName, e);
                if (e.status == Status.exit)
                    exitCollection.add(empName);
            }
        }
        // last who are in enter state should be in enterCollection
        employeeMap.
                entrySet().
                stream().
                filter(e -> e.getValue().status == Status.enter).
                forEach(e -> {
                    enterCollection.add(e.getValue().name);
                });
        System.out.println(enterCollection);
        System.out.println(exitCollection);
    }
}
