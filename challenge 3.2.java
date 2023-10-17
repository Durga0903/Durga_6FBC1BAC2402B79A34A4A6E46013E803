class Student:
    def __init__(self, name, roll_number, cgpa):
        self.name = name
        self.roll_number = roll_number
        self.cgpa = cgpa

def sort_students(students):
    return sorted(students, key=lambda x: x.cgpa, reverse=True)

# Test the function
students_list = [
    Student("John Doe", "A101", 3.9),
    Student("Jane Smith", "A102", 3.7),
    Student("Alice Johnson", "A103", 3.5),
    Student("Bob Williams", "A104", 3.8),
    Student("David Brown", "A105", 3.6)
]

sorted_students = sort_students(students_list)
for student in sorted_students:
    print(f"Name: {student.name}, Roll Number: {student.roll_number}, CGPA: {student.cgpa}")