package br.com.lucasalbuquerque.domain.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.lucasalbuquerque.domain.model.Contacts;
import br.com.lucasalbuquerque.domain.model.CurrentUser;
import br.com.lucasalbuquerque.domain.model.User;

public class MockContactRepository implements ContactRepository {

    @Inject
    public MockContactRepository() {}

    @Override
    public Contacts retrieveContacts(CurrentUser currentUser) {
        List<User> users = new ArrayList<>();
        users.add(new User("Kerr", true));
        users.add(new User("Moisés", false));
        users.add(new User("Primo", true));
        users.add(new User("Pererinha", false));

        return new Contacts(users);
    }
}
