package br.com.lucasalbuquerque.domain.repository;

import br.com.lucasalbuquerque.domain.model.Contacts;
import br.com.lucasalbuquerque.domain.model.CurrentUser;

public interface ContactRepository {
    Contacts retrieveContacts(final CurrentUser currentUser);
}
