package com.nuvyra.learn.programming.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* 
altimetrik: 
find the document type by count

*/

public class DocumentMain {

    public static void main(String[] args) {

        List<Document> documentList = Arrays.asList(
                new Document(1, "abc", "jpg"),
                new Document(2, "def", "png"),
                new Document(4, "fgh", "pdf"),
                new Document(5, "ytr", "png"),
                new Document(6, "jhg", "pdf"));

        convertMap(documentList);

    }

    private static void convertMap(List<Document> documentList) {

        Map<String, Long> countMap =

                documentList.stream()
                        .collect(Collectors.groupingBy(Document::getType, Collectors.counting()));

        System.out.println(countMap);

    }

}
