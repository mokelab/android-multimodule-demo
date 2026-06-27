package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data681RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data682RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data683RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data684RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data685RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data686RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data687RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data688RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data689RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data690RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen069ViewModel @Inject constructor(
    private val repo1: Data681RepositoryImpl,
    private val repo2: Data682RepositoryImpl,
    private val repo3: Data683RepositoryImpl,
    private val repo4: Data684RepositoryImpl,
    private val repo5: Data685RepositoryImpl,
    private val repo6: Data686RepositoryImpl,
    private val repo7: Data687RepositoryImpl,
    private val repo8: Data688RepositoryImpl,
    private val repo9: Data689RepositoryImpl,
    private val repo10: Data690RepositoryImpl,

): ViewModel() {
}
