from abc import ABCMeta, abstractmethod


class Cup(metaclass=ABCMeta):
    """
    Factory 추상 클래스
    """
    @abstractmethod
    def make_ice_cream(self, ice_cream):
        pass
