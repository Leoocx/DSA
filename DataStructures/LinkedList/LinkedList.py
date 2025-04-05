class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

    def get_value(self):
        return self.value

    def get_next(self):
        return self.next

    def set_next(self, next_node):
        self.next = next_node


class LinkedList:
    def __init__(self):
        self.first = None
        self.last = None
        self.size = 0

    def get_first(self):
        return self.first

    def set_first(self, first):
        self.first = first

    def get_last(self):
        return self.last

    def set_last(self, last):
        self.last = last

    def get_size(self):
        return self.size

    def set_size(self, size):
        self.size = size

    def add(self, new_value):
        new_node = Node(new_value)
        if self.first is None and self.last is None:
            self.first = new_node
            self.last = new_node
        else:
            self.last.set_next(new_node)
            self.last = new_node
        self.size += 1

    def delete(self, value_to_remove):
        previous = None
        current = self.first

        while current is not None:
            if current.get_value() == value_to_remove:
                if self.size == 1:
                    self.first = None
                    self.last = None
                elif current == self.first:
                    self.first = current.get_next()
                elif current == self.last:
                    self.last = previous
                    self.last.set_next(None)
                else:
                    previous.set_next(current.get_next())
                self.size -= 1
                break
            previous = current
            current = current.get_next()

    def get(self, index):
        current = self.first
        for _ in range(index):
            if current.get_next() is not None:
                current = current.get_next()
        return current





