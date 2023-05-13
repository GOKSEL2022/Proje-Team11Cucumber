@team11Regression @sunum
Feature:  Kullanıcı admin ekleyebilmelidir.(Contact)

  Scenario Outline:
    Given Database icin contact saglanir
    When "<Ssn>" ile gönderi sorgulanir
    Then resultSet ile veriyi dogrula: name="<Name>" gender="<Gender>" phoneNumber="<Phone Number>" ssn="<Ssn>" userName="<User Name>"
    Examples:
      | Ssn         | Name | Gender | Phone Number | Ssn         | User Name |
      | 748-93-9012 | Lina | MALE   | 128-013-1421 | 748-93-9012 | Lina12    |

