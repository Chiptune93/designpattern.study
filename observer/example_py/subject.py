
class Subject:
    """
    여러 observer를 관리하며 Observer는 Subject 클래스의 register() 와 unregister() 메소드를 호출하여 자신을 등록 및 해제 함
    """
    def __init__(self):
        self.__observers = []

    def register(self, observer):
        self.__observers.append(observer)

    def notifyAll(self, *args, **kwargs):
        for observer in self.__observers:
            observer.notify(self, *args, **kwargs)
