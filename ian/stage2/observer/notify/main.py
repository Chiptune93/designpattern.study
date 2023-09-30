from subject import Subject
from role import Role1, Role2

"""
디스코드 역할
"""

if __name__ == "__main__":
    subject = Subject()
    role1 = Role1(subject)
    role2 = Role2(subject)
    role1.add("ian.curtis")
    role1.add("harry.93")
    role2.add("ian.curtis")
    subject.notify_all("게임 할 사람")
