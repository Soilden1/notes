package dimacm14.service;

import dimacm14.domain.User;

public interface Session {

    User unwrap();

    class EmptySession implements Session {
        @Override
        public User unwrap() {
            return null;
        }
    }
}
