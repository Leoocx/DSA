class Stack
  def initialize(capacidade)
    @stack = Array.new(capacidade)
    @topo = -1
  end

  def push(elemento)
    if is_full?
      @stack += Array.new(@stack.size)  # Dobra o tamanho
    end
    @topo += 1
    @stack[@topo] = elemento
  end

  def pop
    if is_empty?
      puts "ERRO: A pilha está vazia."
      return nil
    end
    elemento_removido = @stack[@topo]
    @stack[@topo] = nil
    @topo -= 1
    elemento_removido
  end

  def peek
    @topo
  end

  def search(elemento)
    @stack.include?(elemento)
  end

  def is_full?
    @topo == @stack.size - 1
  end

  def is_empty?
    @topo == -1
  end

  def show
    @stack.each { |el| puts el unless el.nil? }
  end
end

# Teste da classe Stack

# Criando uma pilha com capacidade inicial 5
pilha = Stack.new(1000)

puts "Adicionando elementos na pilha:"
inicio = Time.now
for i in 0..1000
  pilha.push(i)
end
fim = Time.now
puts "\n Tempo: #{fim-inicio}"
puts "\nConteúdo da pilha:"
pilha.show

puts "\nTopo da pilha está em posição: #{pilha.peek}"

puts "\nRemovendo o elemento do topo:"
removido = pilha.pop
puts "Elemento removido: #{removido}"

puts "\nConteúdo da pilha após remoção:"
pilha.show

puts "\nBuscando o valor 30 na pilha:"
puts pilha.search(30) ? "Encontrado!" : "Não encontrado."

puts "\nEsvaziando a pilha:"
until pilha.is_empty?
  puts "Removendo: #{pilha.pop}"
end

puts "\nTentando remover de pilha vazia:"
pilha.pop
