package dimacm14;

import dimacm14.data.FileUserRepository;
import dimacm14.data.NoteRepository;
import dimacm14.service.Base64PasswordEncoder;
import dimacm14.service.Session;
import dimacm14.ui.LoginUIComponent;
import dimacm14.ui.MainUIComponent;
import dimacm14.ui.UIContainer;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        new UIContainer(
                new LoginUIComponent(
                        new FileUserRepository(
                                Path.of("users.csv")
                        ),
                        new Base64PasswordEncoder()
                ),
                new MainUIComponent(
                        new NoteRepository.MockNoteRepository())
        ).render(
                new Session.EmptySession()
        );
    }
}