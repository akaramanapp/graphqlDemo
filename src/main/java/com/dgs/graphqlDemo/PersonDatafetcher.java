package com.dgs.graphqlDemo;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class PersonDatafetcher {

    private final List<Person> personList = List.of(
            new Person("Kerim", "Karaman", "Turkey", "Istanbul", 1987),
            new Person("Abdullah Kerem", "Öğe", "Turkey", "Istanbul", 1985),
            new Person("Hande", "Özcan", "Turkey", "Istanbul", 1995),
            new Person("Koray Alptuğ", "Düzgün", "Turkey", "Istanbul", 1985)
    );

    @DgsData(parentType = "Query", field = "persons")
    public List<Person> persons(@InputArgument("name") String name) {
        if(name == null) {
            return personList;
        }

        return personList.stream().filter(s -> s.getName().contains(name)).collect(Collectors.toList());
    }
}
