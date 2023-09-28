from subject import Subject
from observer import Observer1, Observer2

if __name__ == "__main__":
    subject = Subject()
    observer1 = Observer1(subject)
    observer2 = Observer2(subject)
    subject.notifyAll("test")
