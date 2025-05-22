// rcc
import React, { Component } from 'react'

import { Button } from 'primereact/Button'
import { IconField } from 'primereact/IconField'
import { InputIcon } from 'primereact/InputIcon'
import { InputText } from 'primereact/InputText'

export default class Busca extends Component {
    // Variaveis de estado, que quando atualizados seu valor, o componente é redesenhado na tela
    state = {
        termoDeBusca: ''
    }

    onTermoAlterado = (event) => {
        // event = objeto que representa o evento (onChange, no caso)
        // target = quem sofre esse evento (a alteração do texto no component InputText, no caso)
        // value = valor da propriedade
        this.setState({termoDeBusca: event.target.value}) // Utilizamos setState() pq ela chama o render()
    }

    onFormSubmit = (event) => {
        event.preventDefault()
        this.props.onBuscaRealizada(this.state.termoDeBusca)
    }

  render() {
    return (
        <form onSubmit={this.onFormSubmit}>
            <div
            className='flex flex-column'>
                <IconField iconPosition='left'>
                    <InputIcon className='pi pi-search'></InputIcon>
                    <InputText 
                    className='w-full' 
                    placeholder={this.props.dica}
                    onChange={this.onTermoAlterado}  // A cada alteração no input, o a função onTermoAlterado() é chamada
                    // essa função tem como responsabilidade, pegar o valor do input e gravar na variavel de estado
                    // e na proxima linha, atualiza o ponteiro da arvore DOM para essa variavel de estado
                    value={this.state.termoDeBusca}/> 
                </IconField>
                <Button label="OK"/>
            </div>
        </form>
    )
  }
}

// Valores pardões para props, caso não sejam informados, utilizado no InputText
// Assim como PARAMETROS são para funções, PROPS são apra componentes, exemplo: 
//      <Busca dica='Buscar imagens de...'/>
//      <div className='w-full'><div>
// Props são 'dica' e 'className', e seus valores são 'Buscar imagens de...' e 'w-full'
Busca.defaultProps = {
    dica: 'Buscar algo...'
}