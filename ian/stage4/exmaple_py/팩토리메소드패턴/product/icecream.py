from abc import ABCMeta, abstractmethod


# abc 는 파이썬에서 추상 클래스를 사용하는 라이브러리
# 추상 클래스로 선성하기 위해서는 ABCMeta를 metaclass 로 지정해야함
# metaclass 란 간단하게 클래스를 만드는 클래스 !! 라고 한다
# abstractmethod = 추상 매서드로 지정하겠다는 데코레이터

class IceCream(metaclass=ABCMeta):
    """
    Product 추상 클래스
    """

    @abstractmethod
    def taste(self) -> str:
        pass
