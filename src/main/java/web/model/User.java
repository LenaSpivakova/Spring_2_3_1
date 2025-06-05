package web.model;


import web.validation.CheckEmail;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Size(min = 2, max = 12, message = "name must be min 2 symbols")
        private String name;
        @NotBlank(message ="Surname is required field")
        private String surname;
        @CheckEmail
        private String email;

        public User() {}

        public User(String name, String surname, String email) {
            this.name = name;
            this.surname = surname;
            this.email = email;
        }

        public Long getId() { return id; }

        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public String getSurname() { return surname; }

        public void setSurname(String surname) { this.surname = surname; }

        public String getEmail() { return email; }

        public void setEmail(String email) { this.email = email; }
}
