class Node
  attr_accessor :value, :next

  def initialize(value)
    @value = value
    @next = nil
  end
end

class LinkedList
  attr_accessor :first, :last, :size

  def initialize
    @first = nil
    @last = nil
    @size = 0
  end

  def add(new_value)
    new_node = Node.new(new_value)
    if @first.nil?
      @first = new_node
      @last = new_node
    else
      @last.next = new_node
      @last = new_node
    end
    @size += 1
  end

  def delete(value_to_remove)
    previous = nil
    current = @first

    while current
      if current.value == value_to_remove
        if @size == 1
          @first = @last = nil
        elsif current == @first
          @first = current.next
        elsif current == @last
          @last = previous
          @last.next = nil
        else
          previous.next = current.next
        end
        @size -= 1
        break
      end
      previous = current
      current = current.next
    end
  end

  def get(index)
    current = @first
    index.times { current = current.next if current }
    current
  end
end
