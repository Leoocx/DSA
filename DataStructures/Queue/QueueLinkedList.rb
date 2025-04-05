class QueueLinkedList
  def initialize
    @linked_list = LinkedList.new
  end

  def enqueue(elemento)
    @linked_list.add(elemento)
  end

  def dequeue
    if is_empty?
      puts "A fila está vazia."
    else
      @linked_list.delete(@linked_list.first.value)
    end
  end

  def show
    current = @linked_list.first
    while current
      puts current.value
      current = current.next
    end
  end

  def is_empty?
    @linked_list.size == 0
  end
end
