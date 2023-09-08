# Generative AI Test Regex Project

## Description:

This Java application contains a service for validating string values. The check is made for the presence of uppercase and lowercase letters, special characters, numbers, and spaces. It is also checked whether the length of the value does not exceed the maximum, which is passed as a parameter to the method. The service returns a boolean value for a valid or invalid string.

## Implementation description:

Validation Service `valid` method checks whether string meets the following requirements:
1. The length does not exceed the value of the `maxLength` parameter
2. Contains at least one uppercase letter
3. Contains at least one lowercase letter
4. Contains at least one of the following special characters: `!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~`
5. Doesn't contain any whitespace characters(spaces, tabs or newlines)

## Setup:
1. Clone repository https://github.com/bakaydmytro/regex
2. Run Maven command: mvn clean install
