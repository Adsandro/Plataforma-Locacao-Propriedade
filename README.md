
# **[Plataforma-Locacao-Propriedade](https://github.com/MarinaMts/Plataforma-Locacao-Propriedade)**

## Description
This is an extension of the original project, now including specific functionalities for users and owners. The code has been divided into different classes in the menu package for better organization and readability.

## Project Structure
### Additional Files
- **MenuUsuario.java:** Contains the `MenuUser` class with the `openUserMenu` method, which manages the menu specifically for users. It offers options such as viewing properties, reserving a property, etc.

- **MenuProprietariow.java:** Contains the `MenuOwner` class with the `openOwnerMenu` method, which manages the menu specifically for owners. It offers options such as registering a new property, viewing reservations, etc.

- **Cadastro.java:** Contains the `Registration` class that provides methods for registering users, logging in, and validating credentials.

- **SessaoUsuario.java:** Contains the `UserSession` class that represents the user's session after login, keeping information about the authenticated user.

- **Reserva.java:** Represents the `Reservation` class that can be used to handle information related to reservations.

### Modifications in Menu.java
The `openMenu` method now offers three main options:
1. **Register new user:** Allows the user to register a new user.
2. **I'm a user:** Requests the user's credentials for login and, if successful, opens the user-specific menu.
3. **I'm an owner:** Requests the user's credentials for login and, if successful, opens the owner-specific menu.

## Usage
Usage remains the same as mentioned in the previous README. Execute the `Main.java` file and follow the instructions provided in the menu.

## Contribution
If you wish to contribute to the development of this project, feel free to send pull requests or open issues.

## Authors
[Marina Lucas Martins](https://www.linkedin.com/in/marinalucasmartins/).

## License
This project is licensed under the MIT License. See the `LICENSE.md` file for more details.
