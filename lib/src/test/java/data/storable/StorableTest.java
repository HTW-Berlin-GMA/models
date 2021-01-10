package data.storable;

import data.storable.user.User;
import data.storable.user.UserImpl;
import data.storage.Storage;
import data.storage.UserStorage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.UUID;

class StorableTest {
    private Storage storage_users = new UserStorage(BigDecimal.valueOf(99999));
    private Storage storage_actions = new UserStorage(BigDecimal.valueOf(99999));
    private Storable user_1;
    private Storable user_2;
    private Storable actions_1;
    private Storable actions_2;

    @BeforeEach
    void setUp() {
        this.user_1 = Mockito.mock(User.class);
        this.user_2 = Mockito.mock(User.class);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void good_create_user() {
        // SET-UP //
        UUID dokriseumUUID = UUID.randomUUID();
        this.user_1 = new UserImpl(dokriseumUUID, "dokriseum");
        // TEST //
        Assertions.assertTrue(dokriseumUUID.equals(this.user_1.getID()));
    }

    @Test
    void good_add_users_in_storage() {
        // SET-UP //
        this.storage_users.getList().add(this.user_1);
        // TEST //
        Assertions.assertTrue(this.storage_users.getList().get(0).equals(this.user_1));
    }

    @Test
    void good_del_users_in_storage() {
        // SET-UP //
        this.storage_users.getList().add(this.user_1);
        this.storage_users.getList().remove(user_1);
        // TEST //
        Assertions.assertFalse(this.storage_users.getList().contains(this.user_1));
    }

    @Test
    void good_update_users_1() {
        // SET-UP //
        UUID dokriseumUUID = UUID.randomUUID();
        this.user_1 = new UserImpl(dokriseumUUID, "dokriseum-");
        String username = "DokRisEum";
        this.storage_users.getList().add(this.user_1);
        ((User) this.storage_users.getList().get(0)).setUsername(username);
        // TEST //
        Assertions.assertEquals(username, ((User) this.storage_users.getList().get(0)).getUsername());
    }

    @Test
    void good_update_users_2() {
        // SET-UP //
        UUID dokriseumUUID = UUID.randomUUID();
        this.user_1 = new UserImpl(dokriseumUUID, "dokriseum");
        String eMailAddress = "DokRisEum@gma.edu";
        this.storage_users.getList().add(this.user_1);
        ((User) this.storage_users.getList().get(0)).setMailAddress(eMailAddress);
        // TEST //
        Assertions.assertEquals(eMailAddress, ((User) this.storage_users.getList().get(0)).getMailAddress());
    }
}