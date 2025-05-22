import React, { Component } from 'react'

export class Loading extends Component {
  render() {
    return (
        <div className="d-flex flex-column justify-content-center align-items-center border rounded p-3 w-100">
            <div 
                className='spinner-border text-primary'
                style={{width: '3rem', height: '3rem'}}
                role='status'>
                <span className="visualy-hidden"></span>
            </div>
            <p className="text-primary mt-4">
                {this.props.mensagem}
            </p>
        </div>
        
    )
  }
}

Loading.defaultProps = {
    mensagem: 'Carregando...'
}

export default Loading