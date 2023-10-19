from abc import ABCMeta, abstractmethod


class Cup(metaclass=ABCMeta):
    @abstractmethod
    def cup(self):
        pass


class WaffleCone(Cup):
    def cup(self):
        return "와플 콘 !!"


class WaffleCup(Cup):
    def cup(self):
        return "와플 컵 !! "
