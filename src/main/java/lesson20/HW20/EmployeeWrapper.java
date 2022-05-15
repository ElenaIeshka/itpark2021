package lesson20.HW20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.List;

import lesson20.HW20.EmployeeWrapper.Fields;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@XmlRootElement(name = Fields.employees)
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeWrapper {
    @XmlElement(name = "employee")
    private List<Employee> employees;
}
