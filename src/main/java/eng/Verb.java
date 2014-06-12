package eng;

/**
 * слова, обозначающие процессы (в широком смысле этого слова), и отвечающие на вопросы "что делать, что сделать?",
 * например: to live (жить), to speak (говорить), to do (делать).
 * Глаголы имеют грамматические категории времени (настоящее, прошедшее, будущее ), лица и числа, вида, залога, наклонения.
 * Выполняют в предложении функцию сказуемого.
 */
public class Verb {
	  VerbTime time = VerbTime.INFINITIVE;
	  String word;

	public Verb(String word) {
		this.word = word;
	}
}

class SemanticVerb extends Verb {
	public SemanticVerb(String word) {
		super(word);
	}
}

/**
 * Служебные глаголы частично или полностью утрачивают свое значение.
 */
class ServiceVerb extends Verb {
	public ServiceVerb(String word) {
		super(word);
	}
}

/**
 * Частичная утрата значения, например, наблюдается у модальных глаголов (саn, mау, и т.д.),
 * что не позволяет им выполнять самостоятельную роль в предложении - они всегда употребляются в
 * сочетании с другими смысловыми глаголами.
 */
class ModelVerb extends ServiceVerb {
	public static final ModelVerb САN = new ModelVerb("can");
	public static final ModelVerb MАУ = new ModelVerb("may");

	ModelVerb(String word) {
		super(word);
	}
}

