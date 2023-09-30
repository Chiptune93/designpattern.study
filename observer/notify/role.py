class Role1:
    def __init__(self, subject):
        subject.register(self)
        self.__members = []

    def add(self, user):
        self.__members.append(user)

    def remove(self, user):
        self.__members.remove(user)

    def notify(self, subject, *args):
        print(type(self).__name__, '::mst', args, 'From', self.__members)


class Role2:
    def __init__(self, subject):
        subject.register(self)
        self.__members = []

    def add(self, user):
        self.__members.append(user)

    def remove(self, user):
        self.__members.remove(user)

    def notify(self, subject, *args):
        print(type(self).__name__, '::mst', args, 'From', self.__members)
