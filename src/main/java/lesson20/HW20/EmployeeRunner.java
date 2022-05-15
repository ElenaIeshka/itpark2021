package lesson20.HW20;

import jakarta.xml.bind.JAXB;
import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class EmployeeRunner {

    private static final List<Department> DEPARTMENTS = List.of(new Department("IT", "Samara"),
            new Department("Account", "Samara"),
            new Department("Maintenance", "Samara"));

    private static final List<Position> POSITIONS = List.of(new Position("Developer", new BigDecimal(1000)),
            new Position("Tester", new BigDecimal(800)),
            new Position("Team Leader", new BigDecimal(2000)));

    private static int COUNTER = 1;

    public static void main(String[] args) {
        System.out.println("Запуск программы");
        EmployeeWrapper employees = new EmployeeWrapper(List.of(getEmployee("Попова Светлана Олеговна"),
                getEmployee("Сидорова Алла Андреевна"),
                getEmployee("Фунтик Николай Васильевич")));
        Path path = Paths.get("C:\\Users\\pavlo\\OneDrive\\Рабочий стол\\test\\employee.xml");
        Path parentPath = path.getParent();
        System.out.printf("Попытка создания родительской директории %s\n", parentPath);
        if (!parentPath.toFile().exists()) {
            parentPath.toFile().mkdirs();
        }
        System.out.printf("Маршалинг данных в файл %s\n", path.getFileName());
        JAXB.marshal(employees, path.toFile());
        Document document = getDocument(path.toFile());
        Integer averageSalary = getAverageSalary(document);
        System.out.printf("Поиск сотрудников с з.п выше среднего %d\n", averageSalary);
        List<String> employeeList = searchEmployeesWithMoreAverageSalary(document, averageSalary);
        System.out.println(employeeList);
    }


    private static Employee getEmployee(String fullName) {
        return new Employee().setLogin("user" + COUNTER++)
                .setFullName(fullName)
                .setTabNumber(new Random().nextInt(100_000) + "")
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(POSITIONS.get(new Random().nextInt(POSITIONS.size())));
    }

    @SneakyThrows
    private static List<String> searchEmployeesWithMoreAverageSalary(Document doc, int salary) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        NodeList nodeList = (NodeList) xPathFactory.newXPath().compile("//employee/position[@salary>" + salary + "]/ancestor::employee/fullName/text()")
                .evaluate(doc, XPathConstants.NODESET);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            result.add(item.getNodeValue());
        }
        return result;
    }

    @SneakyThrows
    private static Integer getAverageSalary(Document doc) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        Double result = (Double) xPathFactory.newXPath().compile("sum(//position/@salary) div count(//position)").evaluate(doc, XPathConstants.NUMBER);
        return result != null ? result.intValue() : 0;
    }

    @SneakyThrows
    private static Document getDocument(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }
}


