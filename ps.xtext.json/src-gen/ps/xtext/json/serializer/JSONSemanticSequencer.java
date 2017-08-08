/*
 * generated by Xtext 2.12.0
 */
package ps.xtext.json.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ps.xtext.json.jSON.Array;
import ps.xtext.json.jSON.False;
import ps.xtext.json.jSON.JSONPackage;
import ps.xtext.json.jSON.Null;
import ps.xtext.json.jSON.Pair;
import ps.xtext.json.jSON.Str;
import ps.xtext.json.jSON.True;
import ps.xtext.json.services.JSONGrammarAccess;

@SuppressWarnings("all")
public class JSONSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JSONGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JSONPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JSONPackage.ARRAY:
				sequence_Array(context, (Array) semanticObject); 
				return; 
			case JSONPackage.FALSE:
				sequence_Boolean(context, (False) semanticObject); 
				return; 
			case JSONPackage.NULL:
				sequence_Null(context, (Null) semanticObject); 
				return; 
			case JSONPackage.NUMBER:
				sequence_Number(context, (ps.xtext.json.jSON.Number) semanticObject); 
				return; 
			case JSONPackage.OBJECT:
				sequence_Object(context, (ps.xtext.json.jSON.Object) semanticObject); 
				return; 
			case JSONPackage.PAIR:
				sequence_Pair(context, (Pair) semanticObject); 
				return; 
			case JSONPackage.STR:
				sequence_Str(context, (Str) semanticObject); 
				return; 
			case JSONPackage.TRUE:
				sequence_Boolean(context, (True) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Value returns Array
	 *     Array returns Array
	 *
	 * Constraint:
	 *     (values+=Value values+=Value*)?
	 */
	protected void sequence_Array(ISerializationContext context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns False
	 *     Boolean returns False
	 *
	 * Constraint:
	 *     {False}
	 */
	protected void sequence_Boolean(ISerializationContext context, False semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns True
	 *     Boolean returns True
	 *
	 * Constraint:
	 *     {True}
	 */
	protected void sequence_Boolean(ISerializationContext context, True semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Null
	 *     Null returns Null
	 *
	 * Constraint:
	 *     {Null}
	 */
	protected void sequence_Null(ISerializationContext context, Null semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     {Number}
	 */
	protected void sequence_Number(ISerializationContext context, ps.xtext.json.jSON.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Object
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (pairs+=Pair pairs+=Pair*)?
	 */
	protected void sequence_Object(ISerializationContext context, ps.xtext.json.jSON.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pair returns Pair
	 *
	 * Constraint:
	 *     (string=STRING value=Value)
	 */
	protected void sequence_Pair(ISerializationContext context, Pair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JSONPackage.Literals.PAIR__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JSONPackage.Literals.PAIR__STRING));
			if (transientValues.isValueTransient(semanticObject, JSONPackage.Literals.PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JSONPackage.Literals.PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPairAccess().getStringSTRINGTerminalRuleCall_0_0(), semanticObject.getString());
		feeder.accept(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Str
	 *     Str returns Str
	 *
	 * Constraint:
	 *     {Str}
	 */
	protected void sequence_Str(ISerializationContext context, Str semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
