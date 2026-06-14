class Person:
    def __init__(self, name, age):
        self.name = name
        self._age = age  # Convention: _age indicates it's intended to be "private"

    def get_age(self):  # Getter for age
        return self._age

    def set_age(self, new_age):  # Setter for age
        if new_age >= 0 and new_age <= 150:  # Validation
            self._age = new_age
        else:
            print("Invalid age!")

person1 = Person("Alice", 30)
print(person1.get_age())  # Output: 30

person1.set_age(35)
print(person1.get_age())  # Output: 35

person1.set_age(-5)   # Output: Invalid age!
print(person1.get_age())   # Output: 35 (age wasn't changed)