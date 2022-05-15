package lesson24.hw24.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lesson24.hw24.dto.AuthorAndBook;
import lombok.experimental.UtilityClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
    public class CsvMapper {
    public List<AuthorAndBook> getBookInfo() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader
                    (CsvMapper.class.getResourceAsStream("/booksHw24.csv")))) {
                CsvToBean<AuthorAndBook> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(AuthorAndBook.class)
                        .withSeparator(';')
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();
                return csvToBean.stream().collect(Collectors.toList());
//                final List<AuthorAndBook> books = csvToBean.stream().collect(Collectors.toList());
//                System.out.println(books);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Collections.emptyList();
        }
    }

